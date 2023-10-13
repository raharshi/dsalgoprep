package com.untangle.dsalgoprep.datastructures;

import java.util.Hashtable;

public class HashTableDemo {
    /*
     * Hashtable is a datastructure key-value pairs.
     * to find the index where to place the element, we use key.hashcode() method which is called "hashing"
     * If integer we use element%numOfElements
     * If String we use the formula s[0]*31^(n-1)+s[1]*31^(n-2)......+s[n-1]
     * If we have collision of elements in same key we consider value as bucket and turn it into LinkedList
     * no collisions = more efficient.
     * Runtime Complexity: If no collisions -> O(1)
     *                     If exclusively collisions -> O(n) puts all elements in same index.
     */
    public static void main(String[] args){
        Hashtable<String,String> table = new Hashtable<>(10);

        table.put("100","Spongebob");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","Squidward");
        table.put("777","Gary");

        // table.remove(777);

        for(String key: table.keySet()){
            System.out.println(key.hashCode()%10+"\t"+key+"\t"+table.get(key));
        }

    }
}
