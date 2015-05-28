/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;
 
public class LeerXML {
    
    public LeerXML(String pRuta, String pPalabra){
 
        try {

            File fXmlFile = new File(pRuta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root  :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName(pPalabra);

            for (int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);

                    System.out.println("\nCurrent Element :" + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element eElement = (Element) nNode;
                            System.out.println("URL id : " + eElement.getAttribute("id"));
                            System.out.println("URL : " + eElement.getElementsByTagName("url").item(0).getTextContent());
                    }
            }
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
        }
      }

    }