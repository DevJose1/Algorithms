package SortingAlgorithms;
/*This algorithm is used to sort a list of elements by comparing 
 * two adjacent elements. We swapped If there is no order, Then 
we continue until An ordered list and no more swapping is needed */
public class BubbleSort {
	
	public static void bubbleSort(int[] tab) {
		boolean swapping = true;
		for (int i=0; i< tab.length-1; i++) {
			swapping = false;
			for(int j=0; j<tab.length-i-1; j++) {
				if (tab[j]>tab[j+1]) {
					int temp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1]= temp;
					swapping = true;
				}				
			}
			if (swapping==false) {
				break;
			}
			
			
		}
		
	}

}
