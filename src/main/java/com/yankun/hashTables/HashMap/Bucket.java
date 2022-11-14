package com.yankun.hashTables.HashMap;
import java.util.*;
/**
 * Implement a bucket data structure with a linked list.
 *
 * A Bucket data structure supports get(key), update(key, value),
 * remove(key).
 *
 * @author yankunM
 * @version Nov 13, 2022
 */
public class Bucket {
    /**
     * A list data structure to store Pairs.
     */
    private List<Pair<Integer,Integer>> bucket;

    /**
     * Constructs and Initializes bucket.
     */
    public Bucket(){
        bucket = new LinkedList<>();
    }

    /**
     * Gets the value corresponding to the given key in the bucket
     * @param key Integer
     * @return value - Integer
     */
    public Integer get(Integer key){
        for(Pair<Integer, Integer> pair: bucket){
            if(pair.first.equals(key)){
                return pair.second;
            }
        }
        return -1;
    }

    /**
     * Updates the value for the key in the bucket if it exists, else it puts this pair in.
     * @param key Integer
     * @param value Integer
     */
    public void update(Integer key, Integer value){
        boolean found = false;
        for(Pair<Integer, Integer> pair: bucket){
            if(pair.first.equals(key)){
                pair.second = value;
                found = true;
            }
        }
        if(!found){
            bucket.add(new Pair<>(key, value));
        }
    }

    /**
     * Remove Pair with key in linked list.
     * @param key Integer
     */
    public void remove(Integer key){
        for(Pair<Integer, Integer> pair: bucket){
            if(pair.first.equals(key)){
                bucket.remove(pair);
                break;
            }
        }
    }

}
