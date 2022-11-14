package com.yankun.hashTables.HashSet;
import java.util.*;

/**
 * Example of using a hash set to find duplicates in an array.
 *
 * @author yankunM
 */
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(findDuplicates(list));

    }
    public static boolean findDuplicates(List<Integer> keys){
        Set<Integer> hashset = new HashSet<>();
        for(Integer i: keys){
            if(hashset.contains(i)){
                return true;
            }
            hashset.add(i);
        }
        return false;
    }
}
