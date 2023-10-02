package com.untangle.dsalgoprep.datastructures;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        createDynamicArray();
    }

    private static void createDynamicArray(){
        DynamicArray array = new DynamicArray(5);
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.insert(0, "X");
        array.delete("A");
        array.delete("B");
        array.delete("C");
        array.delete("D");
        System.out.println(array);
        System.out.println(array.search("C"));
        System.out.println("Empty:: "+array.isEmpty());
        System.out.println("Size:: "+array.size);
        System.out.println("Capacity:: "+array.capacity);
    }
}

