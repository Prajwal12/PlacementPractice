/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
*/

import java.util.*;
public class Main
{
    
    public static void NextPermutation(int[] nums) {
        // find two adjacent elements, n[i-1] < n[i]
        int i = nums.length - 1;
        for (; i > 0; i --) {
            if (nums[i] > nums[i-1]) {
                break;
            }
        }
        if (i != 0) {
            // swap (i-1, x), where x is index of the smallest number in [i, n)
            int x = nums.length - 1;
            for (; x >= i; x --) {
                if (nums[x] > nums[i-1]) {
                    break;
                }
            }
            swap(nums, i - 1, x);
        }
        reverse(nums, i, nums.length - 1);
        
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    // reverse a[i, j]
    public static void reverse(int[] a, int i, int j) {
        for (; i < j; i ++, j --) {
            swap(a, i, j);
        }
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    ///Accept the number
	    int num = sc.nextInt();
	    int num1=num,n=0;
	    while(num1>0){
	        n++;
	        num1=num1/10;
	    }
	    int arr[] =  new int[n];
	    int i=0;
	    
	    ///Convert to Int to array
	    while(num>0){
	        int d = num%10;
	        num = num/10;
	        arr[i++] = d;
	    }
	    
	    ///Reverse the Array
	    reverse(arr,0,arr.length-1);
	    
	    ///call findNextPermutation
	    findNextPermutation(arr);
	    for(i=0;i<arr.length;i++){
	        System.out.print(arr[i]);
	    }
	}
}
