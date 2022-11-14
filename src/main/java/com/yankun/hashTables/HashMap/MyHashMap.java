package com.yankun.hashTables.HashMap;
import com.yankun.hashTables.HashSet.MyHashSet;

import java.util.*;

/**
 * My own implementation of Hash Map.
 *
 * Uses separate Chaining (Bucket of Pairs data structure).
 * Contains put(key, value), get(key), remove(key).
 *
 * @author yankunM
 * @version Nov 13, 2022
 */
public class MyHashMap {
    /**
     * The size of the hash map. Initialize to 2069.
     */
    private final int tablesize;
    /**
     * The hash table data structure.
     *
     * A list of Buckets (AKA a list of Linked Lists of Pairs).
     */
    private List<Bucket> hashTable;

    /**
     * Constructs and Initializes a hash map.
     */
    public MyHashMap(){
        this.tablesize = 2069;
        this.hashTable = new ArrayList<>();
        for(int i = 0; i < this.tablesize; i++){
            this.hashTable.add(new Bucket());
        }
    }

    /**
     * Puts a key value pair in the hash map.
     * @param key
     * @param value
     */
    public void put(int key, int value){
        int hashKey = key % tablesize;
        this.hashTable.get(hashKey).update(key, value);
    }

    /**
     * Gets the value from hash map given key.
     * @param key int
     * @return value
     */
    public int get(int key){
        int hashKey = key % tablesize;
        return this.hashTable.get(hashKey).get(key);
    }

    /**
     * Removes Pair from hash map with corresponding key.
     * @param key
     */
    public void remove(int key){
        int hashKey = key % tablesize;
        this.hashTable.get(hashKey).remove(key);
    }
}
