package Collections;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

public class TestBox {

  public static void main(String[] args) {
    int arr[] = arr{1,1,2,3,1};

    System.out.println(array123([1, 1, 2, 3, 1]));

    int array1[] = {1,2};

  }

  public static boolean array123(int[] nums) {
int count = 0;
    if (nums.length >= 3) {
      for (int i = 0; i < nums.length - 3; i++) {
        if (nums[i]==1&&nums[i+1]==2&&nums[i+3]==3)count++;
      }
    }
    if (count>0) return true;
    else return false;
    
  }


}