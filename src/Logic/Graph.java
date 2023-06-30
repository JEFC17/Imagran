/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Logic;

/**
 *
 * @author Jelki
 */
public interface Graph { 
    
 public boolean isEmpty();
 public int getSize();
 public void addVertex(Object vertex);
 public void addEdge(Object v1, Object v2);
 public void addWeight(Object v1, Object v2, int weight); 
// public boolean existVertex(int pos);
 public boolean existVertex(Object element);
 public boolean existEdge(Object v1, Object v2);
 public int getPosition(Object element);
 public Object showVertexObject(int pos);
 public void visited(boolean v);
 public String bfs(); // Anchura
 public String dfs(); // Profundidad
    
}
