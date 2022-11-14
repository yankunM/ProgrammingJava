package com.yankun.hashTables.HashSet;
import java.util.*;

/**
 * An example to demonstrate how to use
 * a hash set in java.
 *
 * @author yankunM
 * @version Nov 13, 2022
 */
public class Main {
    public static void main(String[] args) {
        // initializing a hash set
        Set<Integer> hashSet = new HashSet<>();
        // adding elements to the hash set
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(null);
        // want to remove a key from the hash set
        hashSet.remove(2);
        // want to see if hash set contains a certain key
        if(!hashSet.contains(2)){
            System.out.println("Key 2 is not in the hash set.");
        }
        // want to get the size of hashSet
        System.out.println("The size of the hash set is: " + hashSet.size());
        // iterating through the hash set
        for(Integer i: hashSet){
            System.out.println(i + " ");
        }
        // clear the hash set
        hashSet.clear();
        // check if hash set is empty
        if(hashSet.isEmpty()){
            System.out.println("hash set is empty now!!");
        }




    }
}
