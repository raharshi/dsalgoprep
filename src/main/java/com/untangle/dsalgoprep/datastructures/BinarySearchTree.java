package com.untangle.dsalgoprep.datastructures;

public class BinarySearchTree {
    
    Node root;


    public void insert(Node node){
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){
        int num = node.num;
        if(root == null){
            root = node;
            return root;
        }else if(num<root.num){
            root.left = insertHelper(root.left, node);
        }else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }

    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.num);
            displayHelper(root.right);
        }
    }

    public boolean search(int num){
        return searchHelper(root, num);
    }

    private boolean searchHelper(Node root, int num){
        if(root == null){
            return false;
        }
        if(root.num == num){
            return true;
        }
        else if(num > root.num){
            return searchHelper(root.right, num);
        }else{
            return searchHelper(root.left, num);
        }
    }

    public void delete(int data){
        if(search(data)){
            root = deleteHelper(root, data);
        }else{
            System.out.println(data +" couldn't be found");
        }
    }

    private Node deleteHelper(Node root, int data){
        if(root == null){
            return root;
        }else if(data > root.num){
            root.right= deleteHelper(root.right, data);
        }else if(data < root.num){
            root.left =  deleteHelper(root.left, data);
        }else{//node found
            if(root.left == null && root.right == null){
                root = null;
            }else if(root.right != null){// finds a successor to replace root
                root.num = successor(root);
                root.right = deleteHelper(root.right, root.num);
            }else{ //finds a predecessor to replace root
                root.num = predecessor(root);
                root.left = deleteHelper(root.left, data);
            }
        }

        return root;
    }

    private int successor(Node root){// find the least value below the right child of the root node
        root = root.right;
        while(root.left!=null){
            root = root.left;
        }
        return root.num;
    }

    private int predecessor(Node root){ // find the greatest value below the right child of the root node
        root = root.left;
        while(root.right!=null){
            root = root.right;
        }
        return root.num;
    }


}
