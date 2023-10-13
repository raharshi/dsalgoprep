package com.untangle.dsalgoprep.datastructures;

public class Node {
    char data;
    Node left;
    Node right;
    boolean visited;
    int num;


    public Node(char node){
        data = node;
    }
    public Node(int node){
        num = node;
    }
}
