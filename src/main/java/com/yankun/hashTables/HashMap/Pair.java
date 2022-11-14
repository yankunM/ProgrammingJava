package com.yankun.hashTables.HashMap;

/**
 * A Pair data structure.
 *
 * A pair contains two public attributes, first and second.
 *
 * @param <U> first attribute
 * @param <V> second attribute
 */
public class Pair<U,V> {
    /**
     * First element in a pair structure.
     */
    public U first;
    /**
     * Second elements in a pair structure
     */
    public V second;

    /**
     * Constructs and Initializes a Pair.
     * @param f U
     * @param s V
     */
    public Pair(U f, V s){
        first = f;
        second = s;
    }
}
