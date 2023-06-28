/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public interface Queue {
    
    //Cantidad de nodos de la lista.
    public int getSize();
    
    //True si la lista esta vacia.
    public boolean isEmpty();
    
    //Elimina toda la lista.
    public void cancel();
    //Inserta un elemento 
    public void insert (Object element);
    
    //Borra un elemento 
    public Object delete();
    
    //Devuelve el primer elemento
    public Object fristElement();
}
