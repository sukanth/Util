package javaHamad;

/*************************************************************************
 * CS219
 * HW1
 *
 * (shell code - multiple testing cases)
 * maxLength
 * Write a method maxLength that takes an ArrayList of Strings as a
 * parameter and that returns the length of the longest string in the
 * list. If your method is passed an empty list, it should return 0.
**************************************************************************/

import java.util.ArrayList; // to use ArrayList class
import java.util.Arrays;    // to use Arrays.toString(), Arrays.asList() methods
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

public class P2_MaxLength
{
  public static void main(String[] args)
  {
    // testing case 1
    String[] arr1 = {"to", "be", "or", "not", "to", "be", "hamlet"};
    int result1 = 6;
    test(arr1, result1);

    // testing case 2
    String[] arr2 = {"many", "be", "not"};
    int result2 = 4;
    test(arr2, result2);

    // testing case 3
    String[] arr3 = {"biggest", "next", "not"};
    int result3 = 7;
    test(arr3, result3);

    // testing case 4
    String[] arr4 = {"Only one really long string"};
    int result4 = 27;
    test(arr4, result4);

    // testing case 5
    String[] arr5 = {}; // empty list
    int result5 = 0;
    test(arr5, result5);
  } // end main

  //**********************************************************************

  // a testing shell to print input and testing result
  public static void test(String[] list, int expectedResult)
  {
    ArrayList<String> listArrList = new ArrayList<String>(Arrays.asList(list)); // create ArrayList out of array

    System.out.println("Testing:  " + listArrList); // print content of array
    System.out.println("expected: " + expectedResult); // print expected result
    int actualResult = maxLength(listArrList); // call method that solves the problem
    System.out.println("actual:   " + actualResult); // print result
    System.out.println((expectedResult == actualResult)? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //**********************************************************************

  // actual method that solve the problem

  // maxLength: returns the length of the longest string in the ArrayList parameter
  public static int maxLength(ArrayList<String> strs)
  {
    // ADD CODE
    return -1; // fake return

  } // end maxLength


} // end class P2_MaxLength