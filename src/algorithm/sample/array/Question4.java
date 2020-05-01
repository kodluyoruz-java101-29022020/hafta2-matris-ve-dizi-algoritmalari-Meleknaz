package algorithm.sample.array;

import java.util.Random;

public class Question4 {
	
	public static void main(String[] args) {
		
		int[] array=new int[10];
		
		printArray(array);
		System.out.println("\nrepeating numbers:");
		findRepeatingNumbers(array);

	}

	public static void printArray(int[] array) {
		
		Random random=new Random();
		
		for(int i=0; i < array.length; i++) {
				
				array[i]=random.nextInt(10);
				System.out.print(array[i] + " ");
			}
			
	}
	
	public static void findRepeatingNumbers(int[] array) {
		
		for(int i=0; i < array.length; i++) {
			
			if(array[i]==array[i+1])
			System.out.print(array[i] + " ");
		}
	}

}

