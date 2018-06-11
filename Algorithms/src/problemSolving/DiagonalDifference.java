package problemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class DiagonalDifference {
	// Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
    		Long diff= (long) 0;
    		int sumDiagonal1 =0;
    		int sumDiagonal2 = 0;
    		
    		for (int i = 0; i < a.length; i++) {
    			for (int j = 0; j < a.length; j++) {
    				if (i==j) {
    					sumDiagonal1+= a[i][j];
					}
    				
    				if (i+j==a.length-1) {
    					
    					sumDiagonal2+= a[i][j];
						
					}

				}
    					
			}
    	
		return Math.abs(sumDiagonal2-sumDiagonal1);

    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
