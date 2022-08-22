/*
 * Write a java program to store group of integers [order of insertion elements
 * does not matter] (HashSet)
 */

import java.util.*;

class Main {

  public static void main(String[] args) {
    HashSet<Integer> setOfIntegers = new HashSet<Integer>();

    setOfIntegers.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

    System.out.println(setOfIntegers);
  }
}
