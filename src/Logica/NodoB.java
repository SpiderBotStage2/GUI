/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 * clase para nodos de cualquier tipo de arbol
 * @author osboxes
 * @param <dp>
 */
public class NodoB <dp extends Comparable<dp>>{
    
    private dp _dato;
    private NodoB _Hizq;
    private NodoB _Hder;
    private NodoB padre;
    
    public NodoB(dp dato){
        this._dato=dato;
    }
    
    /**
     * metodo para obtener la informacion interna del nodo
     * @return un dato generico
     */
    public dp getDato(){
        return _dato;
    }
    
    /**
     * metodo para establecer el padre de un nodo, se emplea en el arbol Splay
     * @param padre padre es de la clase NodoB
     */
    public void setPadre(NodoB padre){
        this.padre=padre;
    }
    
    /**
     * establece el hijo izquierdo de este nodo 
     * @param hizq recibe un dato tipo NodoB
     */
    public void setHizq(NodoB hizq){
        this._Hizq=hizq;
    }
    
    /**
     * establece el hijo derecho del nodo 
     * @param hder recibe un dato tipo NodoB
     */
    public void setHder(NodoB hder){
        this._Hder=hder;
    }
    
    /**
     * metodo que devuelve el padre de los nodos de un arbol
     * @return NodoB
     */
    public NodoB getPadre(){
        return padre;
    }
    
    /**
     * retorna el hijo izquierdo del nodo
     * @return retorna un dato tipo NodoB
     */
    public NodoB getHizq(){
        return _Hizq;
    }
    
    /**
     * retorna el hijo derecho del nodo
     * @return retorna un dato tipo NodoB
     */
    public NodoB getHder(){
        return _Hder;
    }
}
