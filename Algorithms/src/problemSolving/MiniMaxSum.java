/*Given five positive integers, 
 * find the minimum and maximum values 
 * that can be calculated by summing exactly
 *  four of the five integers. 
 *  Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long
 integers denoting the respective minimum 
 and maximum values that can be calculated by 
 summing exactly four of the five integers.
  (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14*/




package problemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    
    static void miniMaxSum(int[] arr) {
    	int sum =0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        Arrays.sort(arr);
        
        System.out.println((sum-arr[arr.length -1]) +" "+ (sum-arr[0]));
   
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

    
}