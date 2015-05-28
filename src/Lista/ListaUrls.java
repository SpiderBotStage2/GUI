/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 * clase creada para la base de datos para los urls que se van ingresando 
 * para ser procesados por los threads hijos del SpiderBot
 * @author osboxes <-------------------- nombre de la VM de ubuntu
 */
public class ListaUrls{
    
    private NodoLUrl _head;
    private NodoLUrl _tail;

    /**
     * metodo para devolver la cabeza de la lista.
     * @return retorna un dato de la clase NodoLUrl
     */
    public NodoLUrl getHead(){
        return _head;
    }
    
    /**
     * metodo especial para encolar a la lista de Urls que recibe la 
     * urls que se quiere y se le ingresa el nivel de profundidad.
     * @param pDato la url que se ingresa 
     */
    public void enQueue(NodoLUrl pDato){
        if(_head==null){
            _head=_tail= pDato;
        }
        else{
            NodoLUrl tmp1=_tail;
            tmp1.setNext(pDato);
            _tail=(NodoLUrl)tmp1.getNext();
        }
    }
    
    /**
     * metodo para borrar los head una vez que una Url ya se haya seleccionado
     * @return 
     */
    public NodoLUrl deQueue(){
        NodoLUrl tmp= _head;
        _head=(NodoLUrl)_head.getNext();
        return tmp;
    }
    
    /**
     * funcion para imprimir todo el contendio de la lista con la profundidad 
     * de cada uno de los nodos.
     */
    public void print(){
        NodoLUrl tmp=_head;
        while (tmp!=null){
            System.out.println(tmp.getDato());
            tmp=(NodoLUrl)tmp.getNext();
        }
    }
    
    /**
     * metodo de listaUrls para devolver el largo especifico.
     * @return int i
     */
    public int getLenght(){
        int i=0;
        NodoLUrl tmp= _head;
        while(tmp!=null){
            tmp=(NodoLUrl)tmp.getNext();
            i++;
        }
        return i;
    }
}
