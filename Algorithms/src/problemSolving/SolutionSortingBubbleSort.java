package problemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionSortingBubbleSort {
	
	// Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swaps =0;
        boolean isSorted = true;
        
        while(isSorted == true){
            isSorted = false ;
            for (int i = 0; i < a.length-1 ; i++){
                
                if (a[i] > a[i+1]){
                    swaps++;
                    int temp = a[i];
                    a[i]= a[i+1];
                    a[i+1]= temp;
                    isSorted  = true;
                }
          }
            
            
        }
        
        System.out.println("Array is sorted in " + swaps+ " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);


    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
	

}
