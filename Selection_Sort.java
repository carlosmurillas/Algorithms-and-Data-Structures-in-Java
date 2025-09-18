package CS210;

public class Selection_Sort {
	
	public static void main(String[]args) {
		
		int [] array = {9,1,8,2,7,3,6,4,5};
		
		SelectionSort(array);
		
		for (int i: array) {
			
			System.out.print(i);
		}
	}

	private static void SelectionSort(int[] array) {

		for(int i=0; i<array.length-1;i++) { //looks for the correct element to swap into place 
			int min=i;
			for(int j=i+1 ; j<array.length;j++) { //looks for the smallest unsorted element
				
				if(array[min]>array[j]) {
					
					min=j;
				}
			}  
			
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		
	}
}
