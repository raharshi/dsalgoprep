package com.untangle.dsalgoprep.datastructures;

public class GraphDemo {
    
    public static void main(String[] args){
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
        // AdjacencyListGraph graph = new AdjacencyListGraph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(0, 1));

        // graph.depthFirstSearch(3);
        graph.breadthFirstSearch(4);

    }

}
