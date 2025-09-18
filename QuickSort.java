package CS210;

public class QuickSort {
	public static void main(String[]args) {
		
		int [] array = {9,1,8,2,7,3,6,4,5};
		
		QuickSort(array, 0, array.length-1);
		
		for(int i :array) {
			
			System.out.print(i);
		}
		
		
	}

	private static void QuickSort(int[] array, int start, int end) {
		
		if (end<=start) return; // base case
		
		int pivotIndex = partition(array, start, end); // find the location of the pivot		
		

		QuickSort(array,start,pivotIndex-1);//left side
		QuickSort(array,pivotIndex+1,end);//right side
		
	}
	
	private static int partition(int[] array, int start, int end) {
		
		
		int pivot = medianOfThree(start,end,array);
		
		int i=start-1;
		
		for(int j=start;j<=end-1;j++) {
			if(array[j]<pivot) {
				
				i++;
				int temp = array[i];
				array [i] = array[j];
				array [j] = temp;
			}
			
		}
		//Placing pivot at the end destination
		i++;
		int temp = array[i];
		array [i] = array[end];
		array [end] = temp;
		
		return i;//location of our pivot
	}

	private static int medianOfThree(int start, int end,int array[]) {
		int center =(start+end)/2;
		if (array[start]>array[center]) {
			swap(array,start,center);
		}
		if (array[start]>array[end]) {
			swap(array,start,end);
		}
		if (array[center]>array[end]) {
			swap(array,center,end);
		}
		
		swap(array,center,end);
		return array[end];
	}

	private static void swap(int[] array, int a, int b) {
	    int temp = array[a];
	    array[a] = array[b];
	    array[b] = temp;
	}

}
