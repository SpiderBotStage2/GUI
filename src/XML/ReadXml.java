/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import Lista.ListaUrls;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 *
 * @author osboxes
 */
public class ReadXml {
    private File path;
    private DocumentBuilder Dbuilder;
    private DocumentBuilderFactory Dfactory;
    private Document docu;
    private ListaUrls Urls;
}
