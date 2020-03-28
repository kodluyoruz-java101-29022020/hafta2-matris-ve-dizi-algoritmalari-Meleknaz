package hafta_2_odevi;

import java.util.Random;

public class Question4 {
	
	//Hocam bu algoritma calisti ve dogru cevabýda verdi ama consolda bu yazýda cikti nerde hata yaptigimi bulamadým(debug aklima geldi ama yinede anlamdim hata nerde)
	/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at hafta_2_odevi.Question4.findRepeatingNumbers(Question4.java:34)
	at hafta_2_odevi.Question4.main(Question4.java:14)*/
	
	

	public static void main(String[] args) {
		
		//Hocam soruda N boyutunda demissiniz boyutu sonradan verelim diye galiba ama ben yapamadým 10 elemanli dizi tanimladim
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
