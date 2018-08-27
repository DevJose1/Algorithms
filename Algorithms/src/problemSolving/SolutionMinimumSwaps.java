package problemSolving;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class SolutionMinimumSwaps {

	    // Complete the minimumSwaps function below.
	    static int minimumSwaps(int[] arr) {
	        Map <Integer, Integer> m = new HashMap();
	        for (int i=0; i< arr.length; i++){
	            m.put(arr[i], i);
	        }
	        Arrays.sort(arr);
	        for (int i=0; i< arr.length; i++){
	            arr[i]= m.get(arr[i]);
	        }
	        //m= null;
	        int swaps = 0;
	        for (int i=0; i< arr.length; i++){
	            int val = arr[i];
	            if (val < 0) continue; //// Already visited.

	            while (val != i) {
	                int new_val = arr[val];
	                arr[val] = -1;
	                val = new_val;
	                swaps++;
	        }
	            arr[i]=-1;
	            


	    }
	        return swaps;
	    }     

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int res = minimumSwaps(arr);

	        bufferedWriter.write(String.valueOf(res));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

	


