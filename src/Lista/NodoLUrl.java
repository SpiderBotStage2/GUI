/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 * clase para hacer los nodos que se extraen del indice creado por el spiderbot,
 * esta clase se utiliza para crear la lista de parte de este mismo indice y 
 * tambien para crear arboles rojo y negros que luego de que los threads
 * terminen con la lista de parte del spiderbot
 * @author Ellioth
 */
public class NodoLUrl {
    private String _dato;
    private NodoLUrl _next;
    
    /**
     * contructor recibe un dato del tipo string
     * @param url 
     */
    public NodoLUrl(String url){
        this._dato=url;
    }
    
    /**
     * metodo para establecer el nodo siguiente, este solo se utiliza para hacer
     * listas.
     * @param next dato de 
     */
    public void setNext(NodoLUrl next){
        this._next=next;
    }
    
    /**
     * metodo para obtener el dato del nodo, se utliza para cuando se tiene que 
     * realizar compraciones o establecimiento de datos.
     * @return retorna un String ya que este nodo solo contiene direcciones 
     * en formato de string.
     */
    public String getDato(){
        return this._dato;
    }
    
    /**
     * metodo para obtener el nodo siguiente al nodo que estamos haciendo, 
     * este metodo solo se emplea en la creacion de la lista del indice.
     * @return retorna el nodo siguiente al nodo que estamos creando, pertenece
     * a la clase NodoLUrl.
     */
    public NodoLUrl getNext(){
        return this._next;
    }
    
}
