package CS210;

public class MergeSort {
	
	public static void main(String[]args) {
		
		int [] array = {9,1,8,2,7,3,6,4,5};
		
		mergeSort(array);
		
		for(int i :array) {
			
			System.out.print(i);
		}
	}

	private static void mergeSort(int[] array) {

		
		int lenght = array.length;
		int middle = lenght/2;
		
		if(lenght <=1 )return; //base case
		
		int[]leftArray = new int[middle];
		int[]rightArray = new int[lenght - middle];
		
		int i=0;//left array
		int j=0;//right array
		
		
		for(; i<lenght;i++) {
			if(i<middle) { //if is less than middle we copy into the left array
				leftArray[i]=array[i];
				
			}else{
				rightArray[j]=array[i];
				j++;
				
			}
		
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray,array);   
	}
	
	private static void merge(int [] leftArray, int[] rightArray, int [] array) {
		
		int leftSize = array.length /2;
		int rightSize = array.length - leftSize;
		int i=0, l=0 , r=0; //i original array indeces l left r right
		
		
		//check the conditions for merging
		
		
		while (l<leftSize && r<rightSize) {//While there is elements in the right or left array we will continously adding elements to our original array 
			if(leftArray[l]<rightArray[r]) {//in ascending order 
				
				array[i]=leftArray[l];
				i++;
				l++;
				
				}else{
					
				array[i]=rightArray[r];
				i++;
				r++;
				
				}
			}
		while (l<leftSize) {//if the left array is longer we paste the remaining elements
			array[i]=leftArray[l];
			i++;
			l++;
			
		}
		
		while(r<rightSize) {//if the right array is longer we paste the remaining elements
			array[i]=rightArray[r];
			i++;
			r++;
			
		 }
	  }
	}
