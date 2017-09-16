package javaHamad;

/*************************************************************************
 * CS219
 * HW1
 *
 * (shell code - multiple testing cases)
 * removeDuplicates
 * Write a method removeDuplicates that takes as a parameter a sorted
 * ArrayList of Strings and that eliminates any duplicates from the list.
 * Because the values will be sorted, all of the duplicates will be
 * grouped together.
**************************************************************************/

import java.util.ArrayList; // to use ArrayList class
import java.util.Arrays;    // to use Arrays.toString(), Arrays.asList() methods
    // Arrays is a pre-defined class which contains various methods for
    // manipulating arrays
    // Java API: http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

public class P4_RemoveDuplicates
{
  public static void main(String[] args)
  {
    // testing case 1
    String[] arr1 = new String[]{"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"};
    String[] result1 = new String[]{"be", "is", "not", "or", "question", "that", "the", "to"};
    test(arr1, result1);

    // testing case 2
    String[] arr2 = new String[]{"duplicate", "duplicate", "duplicate", "duplicate", "duplicate"};
    String[] result2 = new String[]{"duplicate"};
    test(arr2, result2);

    // testing case 3
    String[] arr3 = new String[]{"unique"};
    String[] result3 = new String[]{"unique"};
    test(arr3, result3);

    // testing case 4
    String[] arr4 = new String[]{"be", "is", "not", "or", "question", "that", "the", "to"};
    String[] result4 = new String[]{"be", "is", "not", "or", "question", "that", "the", "to"};
    test(arr4, result4);

    // testing case 5
    String[] arr5 = {};
    String[] result5 = {};
    test(arr5, result5);

    // testing case 6
    String[] arr6 = new String[]{"he", "here", "there"};
    String[] result6 = new String[]{"he", "here", "there"};
    test(arr6, result6);
  } // end main

  //**********************************************************************

  // a testing shell to print input and testing result
  public static void test(String[] list, String[] expectedResult)
  {
    ArrayList<String> listArrList = new ArrayList<String>(Arrays.asList(list)); // create ArrayList out of array
    String expectedResultStr = Arrays.toString(expectedResult); // save expected result as string

    System.out.println("Testing:  " + listArrList); // print content of array
    System.out.println("expected: " + expectedResultStr); // print expected result
    removeDuplicates(listArrList); // call method with actual functionality
    System.out.println("actual:   " + listArrList); // print result
    System.out.println((expectedResultStr.equals(""+listArrList))? "pass" : "fail"); // testing status: pass or fail
    System.out.println(); // empty line between testing cases
  } // end test

  //**********************************************************************

  // actual method that solve the problem

  // removeDuplicates: eliminates any duplicates from sorted ArrayList parameter
  public static void removeDuplicates(ArrayList<String> strs)
  {
    // ADD CODE

  } // end removeDuplicates


} // end class P4_RemoveDuplicates


