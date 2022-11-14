package com.yankun.hashTables.HashSet;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesTest {
    @Test
    void empty(){
        Integer[] arr = new Integer[]{};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }

    @Test
    void one(){
        Integer[] arr = new Integer[]{1};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }

    @Test
    void two(){
        Integer[] arr = new Integer[]{2};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }
    @Test
    void oneOne(){
        Integer[] arr = new Integer[]{1,1};
        var list = Arrays.stream(arr).toList();
        assertTrue(FindDuplicates.findDuplicates(list));
    }
    @Test
    void oneTwo(){
        Integer[] arr = new Integer[]{1,2};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }
    @Test
    void oneTwoThree(){
        Integer[] arr = new Integer[]{1,2,3};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }
    @Test
    void veryFalse(){
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }
    @Test
    void veryTrue(){
        Integer[] arr = new Integer[]{1,2,3,4,5,6,1,8,9,10,11,12,13,14,15};
        var list = Arrays.stream(arr).toList();
        assertTrue(FindDuplicates.findDuplicates(list));
    }
    @Test
    void oneTwoThreeFourFive(){
        Integer[] arr = new Integer[]{1,2,3,4,5};
        var list = Arrays.stream(arr).toList();
        assertFalse(FindDuplicates.findDuplicates(list));
    }

}