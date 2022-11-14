package com.yankun.hashTables.HashSet;
import java.util.*;



public class MyHashSet {
    /**
     * Bucket class is implemented using Separate Chaining.
     *
     * Each bucket is a linked list.
     *
     * @author yankunM
     * @version 1.0 Build 0001 Nov 13, 2022
     */
    static class Bucket{
        /**
         * Linked list that holds keys
         */
        private LinkedList<Integer> container;

        /**
         * Constructs and Initializes the container linked list
         * using no args constructor of LinkedList class.
         */
        public Bucket(){
            container = new LinkedList<Integer>();
        }

        /**
         * Inserts an elements into the container of this bucket.
         *
         * Method was implemented using addFirst() method of
         * Linked list class.
         *
         * @param key key inserted into the bucket
         */
        public void insert(Integer key){
            this.container.addFirst(key);
        }

        /**
         * Deletes a key from the container.
         *
         * This method calls the remove() method from the Linked List class.
         */
        public void delete(Integer key){
            this.container.remove(key);
        }

        /**
         * Checks whether a key exists in the container.
         *
         * @param key the key to be checked
         * @return boolean - exist or not
         */
        public boolean exists(Integer key){
            int index = this.container.indexOf(key);
            return index != -1;
        }
    }

    /**
     * An array of Buckets.
     */
    private Bucket[] bucketArray;

    /**
     * The size of the bucket Array.
     */
    private int keyRange;

    /**
     * Constructs and Initializes a Hash Set with 769 buckets.
     */
    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for(int i = 0; i < this.keyRange; i++){
            this.bucketArray[i] = new Bucket();
        }
    }

    /**
     * The hash function.
     *
     * This hash function is using the modulo operator. Any
     * key is modded with the size of the bucket Array to determine
     * the index it should be mapped to.
     *
     * @param key the key to be mapped to a bucket
     * @return the index of the bucket key should be mapped to
     */
    protected int _hash(int key){
        return (key % this.keyRange);
    }

    /**
     * Adds the key to the hashSet.
     *
     * The method determines the index the key should be mapped to
     * by calling the hash function, then the key is inserted into
     * the bucket at that index using insert() method from Bucket class.
     *
     *
     * @param key the key to be put into the hashSet
     */
    public void add(int key) {
        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].insert(key);
    }

    /**
     * Removes a key from the hashSet.
     *
     * Finds which bucket the key should be in, and calls
     * remove() method from Bucket class, which calls delete() method
     * from LinkedList class.
     *
     * @param key the key to be removed from the hashSet
     */
    public void remove(int key){
        int bucketIndex = this._hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }

    /**
     * Checks whether a key exists in the hashSet.
     *
     * Calls the exists() method from Bucket class.
     *
     * @param key the key to be checked
     * @return boolean - true or false
     */
    public boolean contains(int key){
        int bucketIndex = this._hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }
}
