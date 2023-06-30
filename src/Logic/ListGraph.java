/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author Jelki
 */
public class ListGraph implements Graph{
    
    private Vertex[] vertexes;
    private int count;
    private LinkedStack stack;
    private LinkedQueue queue;
    
    public ListGraph(int n){
        if (n <= 0) {
            System.exit(0);
        }
        
        count =0;
        vertexes = new Vertex[n];
        stack = new LinkedStack();
        queue = new LinkedQueue();
    }
    
    public void cancel(){
        for (int i = 0; i < count; i++) {
            vertexes[i] = null;
        }
        count=0;
    }

    @Override
    public boolean isEmpty() {
        return count ==0;
    }

    @Override
    public int getSize() throws Exception{
        if (isEmpty()) throw new Exception("Graph is no exits");
        return count;
    }

    @Override
    public void addVertex(Object vertex) throws Exception{
        
        if (count>= vertexes.length)throw new Exception("The Graph is full");
        
        vertexes[count++] = new Vertex(vertex);
    }

    @Override
    public void addEdge(Object v1, Object v2) throws Exception{
         if (!existVertex(v1)||!existVertex(v2))throw new Exception("They vertex is not exist");
         
         vertexes[getPosition(v1)].listEdge.addEnd(v2);
         vertexes[getPosition(v2)].listEdge.addEnd(v1);
    }

    @Override
    public void addWeight(Object v1, Object v2, int weight)throws Exception {
        if (!existVertex(v1)||!existVertex(v2))throw new Exception("They vertex is not exist");
        
        vertexes[getPosition(v1)].listEdge.addEnd(v2);
        vertexes[getPosition(v2)].listEdge.addEnd(v1);
        vertexes[getPosition(v1)].listWeight.addEnd(weight);
        vertexes[getPosition(v2)].listWeight.addEnd(weight);
    }

    @Override
    public boolean existVertex(Object element)throws Exception {
        if (isEmpty()) throw new Exception("Graph is no exits");
        
        for (int i = 0; i < count; i++) {
            if (vertexes[i].element.toString().equals(element.toString())) {
                return true;
            }   
        }
        return false;
    }

    @Override
    public boolean existEdge(Object v1, Object v2)throws Exception {
        if (isEmpty()) throw new Exception("Graph is no exits");
        
        if (vertexes[getPosition(v1)].listEdge.exists(v2)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getPosition(Object element)throws Exception {
        if (isEmpty()) throw new Exception("Graph is no exits");
        if (!existVertex(element)) throw new ExceptionList("Vertex is no exits");
        for (int i = 0; i < count; i++) {
            if (vertexes[i].element.toString().equals(element.toString())) {
                return i;
            }   
        }
        return -1;
    }

    @Override
    public Object showVertexObject(int pos)throws Exception {
        if (pos<0||pos>=count)throw new Exception("They vertex is not exist");
        
        return vertexes[pos].element;
    }
    
    public Vertex showVertex(int pos)throws Exception {
        if (pos<0||pos>=count)throw new Exception("They vertex is not exist");
        
        return vertexes[pos];
    }

    @Override
    public void visited(boolean v) {
        for (int i = 0; i < count; i++) {
            vertexes[i].visited = v;
        }
    }
    
    @Override
    public String bfs() throws Exception {
        if (this.isEmpty()) throw new Exception("Graph is no exits");
        
        this.queue.cancel();
        this.queue.insert(((Vertex)showVertexObject(0)).element);
        vertexes[0].visited = true;
        
        String info = "";
        
        while (!this.queue.isEmpty()) {
            
            Object current = this.queue.delete();//Let's get the value of the current node so we can add it to the string
            info += "Vertex in position " + this.getPosition(current) + " is: " + current + "\n";
            
            for (int i = 0; i < this.vertexes.length; i++) {
//                System.out.println(""+showVertex(index).element);
                if ((existEdge(current, showVertex(i).element)) && (!this.vertexes[i].visited)) {
                    
                    this.vertexes[i].visited = true;//declare the new vertex as visited
                    this.queue.insert(((Vertex)this.showVertexObject(i)).element);//add a new vertex
                }//if
            }//for
        }//while to remove elements of the queue
        
        visited(false);//declare all nodes as unvisited
        return info;
    }//bfs

    
    @Override
    public String dfs() throws Exception{
        if (this.isEmpty()) throw new Exception("Graph is no exits");
        
        String info = "";//the variable where the traversed vertices are stored is set
        //The stack does not ensure that the first edges located are the first to process, so the first edge extracted may be the last to analyze.
//        this.stack.cancel();//clear al stack for a new search
        this.stack.push(((Vertex)showVertexObject(0)).element);//add to the stack the vertex to start the traversal
        vertexes[0].visited = true;//we declare that first vertex as visited
        
        while (!this.stack.isEmpty()) {
            Object current = this.stack.pop();//Let's get the value of the current vertex so we can add it to the string
            info += "Vertex in position " + this.getPosition(current) + " is: " + current + "\n";
            
            for (int index = 0; index < this.vertexes.length; index++) {
                if (this.existEdge(current, (showVertex(index)).element) && !this.vertexes[index].visited) {
                    this.vertexes[index].visited = true;//declare the new vertex as visited
                    this.stack.push(((Vertex)showVertexObject(index)).element);//add a new unvisited vertex
                }//if
            }//for
        }//while 
        
        visited(false);
        return info;
    }//dfs

    
    @Override
    public String toString() {

        String salida = "INFORMACION DEL GRAFO \n ";
        salida += "con lista de adyacencia \n";
        salida += "------------------------\n";

        for (int i = 0; i < count; i++) {
            salida += "el vertice en la posicion " + i + " es: " + vertexes[i].element + "\n";
        }

        salida += "aristas y pesos del grafo\n\n";
        for (int i = 0; i < count; i++) {
            salida += "Vertice: " + vertexes[i].element + "\n";
            salida += "-----Aristas: " + vertexes[i].listEdge.toString() + "\n";
            salida += "-----Pesos: " + vertexes[i].listWeight.toString() + "\n";
            salida += "--------------------------------\n\n";
        }//for

        salida += "\n";
        return salida;

    }//fin to String

    public LinkedQueue getSugerencias(Object vertex)throws Exception{
        if (!existVertex(vertex)|| isEmpty())throw new Exception("Unfeasible operation");
        // look for the Vertex
         Vertex point = vertexes[getPosition(vertex.toString())];// We get the vertex
        
         if (point.listEdge.getSize()==0) {
             LinkedQueue queue = new LinkedQueue();
             for (int i = 0; i < count; i++) {
                 queue.insert(vertexes[i].element);
             }
            return queue;
        }
        // Conexion of vertex
        ArrayList <Vertex> amigos = getConexion(point);// we obtain the vertex connections
        return getSugerenciasOrdenadas// return Sorted suggestion queue
        (conexionByConexion(amigos, point), point);//(return ArrayList connectionsByConnection(vertex connections connections, vertex);, vertex)
    }

    private ArrayList<Vertex> getConexion(Vertex point) {
        Vertex[] auxVertex = new Vertex[this.vertexes.length]; 
        auxVertex= this.vertexes;
        ArrayList <Vertex> conexion = new <Vertex>ArrayList();
        
        for (int i = 0; i < count; i++) {auxVertex[i].visited = false;}
        
        for (int i = 0; i < auxVertex.length; i++) {
            if (existEdge(point.element, auxVertex[i].element)
                    && auxVertex[i].visited==false) {
                conexion.add(showVertex(i));
                auxVertex[i].visited = true;
            }
        }

        return conexion;
    }
    
    private ArrayList<Vertex> conexionByConexion(ArrayList <Vertex>conexion, Vertex point){
        ArrayList <Vertex> conexionByConexion = new<Vertex> ArrayList();
        int cont=0;
        ArrayList <Vertex> conexionOfConexion= getConexion(showVertex(getPosition(conexion.get(0).element)));// We obtain the connections of the first connection of the point
        visited(false);
        while (!conexion.isEmpty()) { // as long as it's not empty         

            for (int i = 0; i < conexionOfConexion.size(); i++) {// Let's walk through the connections of the dot connection

                
                if (!conexionOfConexion.get(i).element.toString().equals(point.element.toString()) // as long as the connection is not with the point
                        && !existEdge(point.element, conexionOfConexion.get(i).element) // as long as there is no connection to the point
                        && vertexes[getPosition(conexionOfConexion.get(i).element)].visited==false) { // And it has not been visited before
                    
                    conexionByConexion.add(showVertex(getPosition(conexionOfConexion.get(i).element)));
                    vertexes[getPosition(conexionOfConexion.get(i).element)].visited=true;
                }
            }
            conexion.remove(0);// We remove the connection of the point to which we already searched for its connections
            if (!conexion.isEmpty()) {
                conexionOfConexion= getConexion(showVertex(getPosition(conexion.get(0).element)));// We assign a new Connection of connections
            }
        }
        
        
        visited(false);//reset visible
        return conexionByConexion;
    }
    
    private LinkedQueue getSugerenciasOrdenadas(ArrayList <Vertex>conexionOfConexion, Vertex point){
        LinkedQueue sugerencias = new LinkedQueue();

        this.queue.cancel();
        visited(false);
        this.queue.insert(getPosition(point.element));
        vertexes[getPosition(point.element)].visited = true;
//        boolean salir=false;
        
        while (!this.queue.isEmpty()) {//the algorithm runs as long as the queue is full when there are nodes left to visit
            
            Object current = this.queue.delete();
            
            for (int i = 0; i < conexionOfConexion.size(); i++) {
                
                if ((!existEdge(point.element, conexionOfConexion.get(i).element))  //Is there a connection between the point and the connection of the connection?
                        &&(!current.toString().equals(conexionOfConexion.get(i).element.toString())) // The connection of connections equals the element of the queue
                        && (!this.vertexes[getPosition(conexionOfConexion.get(i))].visited)) {  // Has the connection of the connection been visited before?
                    
                    this.vertexes[getPosition(conexionOfConexion.get(i).element)].visited = true;//declare the vertex as visited
                    sugerencias.insert(conexionOfConexion.get(i).element);//add a new 
                    
                }//if
            }//for
        }//while 
        
        visited(false);//reset visible
        return sugerencias;
    }
    
    
}
