package problemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {
	// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	int countPositifNumber=0;
		int countNegatifNumber= 0;
		int countZerofNumber = 0;
        int N = arr.length;
		
    float facCountpositive,  fracCountNegative, fracCountZero= 0 ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				countPositifNumber++;
			}
			else if (arr[i]==0) {
				countZerofNumber++;
			}
			else  {
				countNegatifNumber++;
				
			}    

        }
     facCountpositive = (countPositifNumber/(float)N);
     fracCountNegative = countNegatifNumber/(float)N;
    fracCountZero = countZerofNumber/(float)N;
    
    System.out.println(facCountpositive);
    System.out.println(fracCountNegative);

   System.out.println(fracCountZero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
