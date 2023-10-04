package com.untangle.dsalgoprep.algorithms.sorting;

public class RecursionDemo {
    
    /*
     * A recursive method calls itself and apply the result of a procedure to a procedure, substitute to Iteration.
     * Divide a problem into sub-problems of the same type as original.
     * Commonly used with advanced sorting algorithm and navigating trees.
     */

    /*
      * Advantages.
      * easier to read/write
      * easier to debug
      */

    /*
       * Disadvantages
       * sometimes slower
       * used more memory
       */
    public static void main(String[] args){
        // walk(5);
        // System.out.println(factorial(7));
        System.out.println(power(2,2));
    }

    private static void walk(int steps){
        if(steps <= 0) return; // base case
            System.out.println("You took a step.");
            walk(steps-1); // recursive case
    }

    private static int factorial(int num){
        if(num < 1 ) return 1; // base case
        return num*factorial(num - 1);
    }

    private static int power(int base, int exponent){
        if(exponent < 1) return 1; // base case
        return base * power(base, exponent-1);
    }
}
