package CS210;

public class Insertion_sort {

	public static void main(String[]args) {
		
		int [] array = {9,1,8,2,7,3,6,4,5};
		
		InsertionSort(array);
		
		for (int i: array) {
			
			System.out.print(i);
		}
	}

private static void InsertionSort(int[] array) {

	for(int i=1; i<array.length;i++) {
		int temp=array[i];
		int j = i-1; // what value we are comparing to the left
		
		while(j>=0 && array[j]>temp) { //A loop to shift the elements to the right until the correct position for temp is found
			
			array[j+1] = array[j];//Shift to the right
			j--;
		}
		array[j+1]=temp;//Stores the correct value into its place
		}	
	}



}

