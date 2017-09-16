package javaHamad;

/*************************************************************************
 * CS219
 * HW1
 *
 * (shell code - multiple testing cases)
 * doubleList
 * Write a method doubleList that takes an ArrayList of Strings as a
 * parameter and that replaces every string with two of that string.
**************************************************************************/

import java.util.ArrayList; // to use ArrayList class
import java.util.Arrays;    // to use Arrays.toString(), Arrays.asList() methods
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

public class P3_DoubleList
{
  public static void main(String[] args)
  {
    // testing case 1
    String[] arr1 = {"how", "are", "you?"};
    String[] result1 = {"how", "how", "are", "are", "you?", "you?"};
    test(arr1, result1);

    // testing case 2
    String[] arr2 = {"I", "am", "great,", "thanks!"};
    String[] result2 = {"I", "I", "am", "am", "great,", "great,", "thanks!", "thanks!"};
    test(arr2, result2);

    // testing case 3
    String[] arr3 = {"One string only"};
    String[] result3 = {"One string only", "One string only"};
    test(arr3, result3);

    // testing case 4
    String[] arr4 = {"1", "4", "3"};
    String[] result4 = {"1", "1", "4", "4", "3", "3"};
    test(arr4, result4);

    // testing case 5
    String[] arr5 = {};
    String[] result5 = {};
    test(arr5, result5);
  } // end main

  //**********************************************************************

  // a testing shell to print input and testing result
  public static void test(String[] list, String[] expectedResult)
  {
    ArrayList<String> listArrList = new ArrayList<String>(Arrays.asList(list)); // create ArrayList out of array
    String expectedResultStr = Arrays.toString(expectedResult); // save expected result as string

    System.out.println("Testing:  " + listArrList); // print content of array
    System.out.println("expected: " + expectedResultStr); // print expected result
    doubleList(listArrList); // call method with actual functionality
    System.out.println("actual:   " + listArrList); // print result
    System.out.println((expectedResultStr.equals(""+listArrList))? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //**********************************************************************

  // actual method that solve the problem

  // doubleList: replaces every string from ArrayList parameter with two of that string
  public static void doubleList(ArrayList<String> strs)
  {
    // ADD CODE

  } // end doubleList


} // end class P3_DoubleList


