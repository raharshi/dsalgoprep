package com.untangle.dsalgoprep.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyListGraph {
    
    ArrayList<LinkedList<Node>> alist;

    public AdjacencyListGraph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> curr = new LinkedList<>();
        curr.add(node);
        alist.add(curr);
    }

    public void addEdge(int src, int dest){
        LinkedList<Node> curr = alist.get(src);
        Node node = alist.get(dest).get(0);
        curr.add(node);
    }

    public boolean checkEdge(int src, int dest){
        LinkedList<Node> curr = alist.get(src);
        Node node = alist.get(dest).get(0);
        for(Node n: curr){
            if(n == node){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> list: alist){
            for(Node node: list){
                System.out.print(node.data+" -> ");
            }
            System.out.println();
        }
    }
}
