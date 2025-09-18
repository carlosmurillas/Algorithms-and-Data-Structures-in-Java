package CS210;

public class Bubble_sort {
	public static void main(String[]args) {
		
		int [] array = {9,1,8,2,7,3,6,4,5};
		
		bubblesort(array);
		
		for(int i :array) {
			
			System.out.print(i);
		}
	}

public static void bubblesort(int array[]) {
	
	for(int i=0; i<array.length-1;i++) { //traverse the array 
		for(int j=0;j<array.length-i-1;j++) {// bubble up the highest numbers
			if(array[j]>array[j+1]) {
				int temp = array[j+1];
				array[j+1]=array[j];
				array[j]=temp;
				
				}
			}
		}
	}	
}
