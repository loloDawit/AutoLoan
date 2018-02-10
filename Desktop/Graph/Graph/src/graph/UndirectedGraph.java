/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList;

/**
 *
 * @author dawitabera
 */
public class UndirectedGraph {
    private int Vertex;
    LinkedList<Integer> adjacencyList[];
    
    public UndirectedGraph(int Vertex){
        this.Vertex = Vertex;
        this.adjacencyList = new LinkedList[Vertex];
    }
    
}
