package javaHamad;

/*************************************************************************
 * CS219
 * HW1
 *
 * (shell code - multiple testing cases)
 * maxToEnd
 * Write a method maxToEnd that takes an ArrayList of Integers as a
 * parameter and that moves the maximum value in the list to the tail,
 * otherwise preserving the order of the elements. You may assume that
 * the list stores at least one value. If there are multiple copies of
 * the maximum value, move the first copy.
**************************************************************************/

import java.util.ArrayList;  // to use ArrayList class

import java.util.Arrays;    // to use Arrays.asList() methods
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html


public class P5_MaxToEnd
{
  public static void main(String[] args)
  {
    // case 1
    Integer[] arr1 = new Integer[]{5, 4, 3, 2, 1};
    Integer[] result1 = new Integer[]{4, 3, 2, 1, 5};
    test(arr1, result1);

    // case 2
    Integer[] arr2 = new Integer[]{5};
    Integer[] result2 = new Integer[]{5};
    test(arr2, result2);

    // case 3
    Integer[] arr3 = new Integer[]{6, 2, 1, 4};
    Integer[] result3 = new Integer[]{2, 1, 4, 6};
    test(arr3, result3);

    // case 4
    Integer[] arr4 = new Integer[]{30, 10, 10, 30, 10};
    Integer[] result4 = new Integer[]{10, 10, 30, 10, 30};
    test(arr4, result4);

  } // end main

  //**********************************************************************

  // a testing shell to print input and testing result
  // do NOT change this test method
  public static void test(Integer[] list, Integer[] expectedResult)
  {
    ArrayList<Integer> listArrList = new ArrayList<Integer>(Arrays.asList(list)); // create ArrayList out of array
    String expectedResultStr = Arrays.toString(expectedResult); // save expected result as string

    System.out.println("Testing:  " + listArrList); // print content of array list
    System.out.println("expected: " + expectedResultStr); // print expected result
    maxToEnd(listArrList); // call method with actual functionality
    System.out.println("actual:   " + listArrList); // print result
    System.out.println((expectedResultStr.equals(""+listArrList))? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //***********************************************************************

  // actual methods
  public static void maxToEnd(ArrayList<Integer> nums)
  {
    // ADD CODE

  } // end maxToEnd

} // end class P5_MaxToEnd