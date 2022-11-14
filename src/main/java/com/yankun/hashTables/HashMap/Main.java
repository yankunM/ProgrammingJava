package com.yankun.hashTables.HashMap;
import java.util.*;

/**
 * Some experiments with Java HashMap class.
 * @author yankunM
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> numbers = new HashMap<>();
        numbers.put(1, "Java");
        numbers.put(2, "Python");
        numbers.put(3, "JavaScript");
        System.out.println("HashMap: " + numbers);

        String val1 = numbers.getOrDefault(1, "Not Found");
        System.out.println(val1);

        String val2 = numbers.getOrDefault(4, "Not Found");
        System.out.println(val2);
    }
}
