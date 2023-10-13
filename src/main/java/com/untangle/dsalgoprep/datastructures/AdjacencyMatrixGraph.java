package com.untangle.dsalgoprep.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrixGraph {
    
    ArrayList<Node> nodes;
    int[][] matrix;

    public AdjacencyMatrixGraph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){
        if(matrix[src][dest] == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        System.out.print("  ");

        for (Node node: nodes) {
            System.out.print(node.data+" ");
        }
        System.out.println();
        for(int i=0; i< matrix.length;i++){
            System.out.print(nodes.get(i).data+" ");
            
            for(int j=0; j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dfsHelper(src, visited);
    }
    
    private void dfsHelper(int src,boolean[] visited){
        if(visited[src]){
            return;
        }else{
            visited[src] = true;
            System.out.println(nodes.get(src).data+" is Visited.");
        }

        for(int i =0; i< matrix[src].length;i++){
            if(matrix[src][i]==1){
                dfsHelper(i, visited);
            }
        }
        return;
    }

    public void breadthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(src);
        visited[src] = true;
        while(!queue.isEmpty()){
            src = queue.poll();
            System.out.println(nodes.get(src).data+" is Visited.");
            for(int i =0; i< matrix[src].length;i++){
                if(matrix[src][i]==1 && !visited[i]){
                    queue.offer(i);
                    visited[i]= true;
                }
            }
        }
    }
}
