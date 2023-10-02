package com.untangle.dsalgoprep.datastructures;

public class DynamicArray {
    int size;
    int capacity=10;
    Object[] array;

    public DynamicArray(){
        this.array= new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size>= capacity){
            grow();
        }
        for(int i=size;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=data;
        size++;
    }

    public void delete(Object data){
        boolean elementFound = false;
        for(int i = 0; i<size;i++){
            // if(array[i] == data || elementFound){
            if(array[i] == data){
                // elementFound = true;
                // array[i] = array[i+1];
                // for(int j=i; j<size;j++){
                for(int j=0; j<(size-i-1);j++){
                    array[i+j] = array[i+j+1];    
                }
                array[size-1]=null;
                size--;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
            
        }
        // elementFound= false;
        // array[size]=null;
        // size--;
        // if(size <= (capacity/3)){
        //     shrink();
        // }
    }

    public int search(Object data){
        for(int i = 0; i<size;i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public void grow(){
        int newCapacity= (int)(capacity*2);
        Object[] newArr = new Object[newCapacity];
        for(int i =0; i<size;i++){
            newArr[i]=array[i];
        }
        capacity = newCapacity;
        array=newArr;
    }

    public void shrink(){
        int newCapacity= (int)(capacity/2);
        Object[] newArr = new Object[newCapacity];
        for(int i =0; i<size;i++){
            newArr[i]=array[i];
        }
        capacity = newCapacity;
        array=newArr;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String string ="";
        for(int i=0;i<capacity;i++){
            string += array[i]+", ";
        }
        if(string!=""){
            string= "["+string.substring(0, string.length()-2)+"]";
        }else{
            string="[]";
        }
        return string;
    }
}
