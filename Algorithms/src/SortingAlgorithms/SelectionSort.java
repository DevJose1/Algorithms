package SortingAlgorithms;
/*Selection Sort is algorithm that find the smallest element in the array and swapped with the element 
 * of the first position. then find the second small element and swapped with
 * the second element in the array. we continue with this process until the entire array is sorted*/
public class SelectionSort {
	public static void sorting(int arry[]) {
		for (int i=0; i<arry.length-1; i++) {
			int idx_min= i;
			for (int j = i+1; j < arry.length; j++) {
				if(arry[j]<arry[idx_min]) {
					idx_min=j;
				}
				//swapping
				int temp = arry[idx_min];
				arry[idx_min]= arry[i];
				arry[i]= temp;
			}
		}
		
	}


}
