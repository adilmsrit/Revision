package Collections;


import java.util.ArrayList;
import java.util.List;

class MyClass1 {
  public static void main(String[] args) {

    ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();

    myArrList.add(new StringBuilder("One"));
    myArrList.add(new StringBuilder("Two"));
    myArrList.add(new StringBuilder("Three"));

    for (StringBuilder element : myArrList)
      element.append(element.length());


    for (StringBuilder s : myArrList) {
      System.out.println(s);
    }

  }
  /*Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
  */

//  public int[] makeLast(int[] nums) {
//
//  }




}

