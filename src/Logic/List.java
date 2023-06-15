/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public interface List {

    //Elimina toda la lista.
    public void cancel();

    //Cantidad de nodos de la lista.
    public int getSize();

    //True si la lista esta vacia.
    public boolean isEmpty();

    //Devuelve un true si el objeto existe; un false si el objeto n existe
    public boolean exists(Object element);

    //Inserta un elemento al inicio de la lista
    public void addHead(Object element);
    
    //Inserta un elemento al final de la lista
    public void addEnd(Object element);

    //Retorna un objeto pidiento la posicion
    public Object getByPosition(int pos);

    //Borra en elemento resiviendo la mismo
    public void deleteByElement(Object element);

    //Devuelve el primer elemento
    public Object fristInList();

    //Devuelve el ultimo elemento
    public Object lastInList();
}
