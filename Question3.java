package hafta_2_odevi;

import java.util.Random;

public class Question3 {

	public static void main(String[] args) {
		
		int[][] firstMatrice=new int[5][5];
		int[][] secondMatrice=new int[5][5];
		System.out.println("First Matrice");
		firstMatrice(firstMatrice);
		System.out.println("\n");
		System.out.println("Second Matrice");
		secondMatrice(secondMatrice);
		System.out.println("Result");
		System.out.println("\n");
		multiplyMatrices(firstMatrice, secondMatrice);		

	}
	
	
	//0 ile 9 arasinda random elemanlari alan birinci matris
	public static void firstMatrice(int[][] firstMatrice) {
		
		Random random=new Random();
		
		for(int i=0; i < firstMatrice.length; i++) {
			
			for(int j=0; j < firstMatrice[0].length; j++) {
				
				firstMatrice[i][j]=random.nextInt(10);
				System.out.print(firstMatrice[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}
	
	//0 ile 9 arasinda random elemanlari alan ikinci matris
	public static void secondMatrice(int[][] secondMatrice) {
		
		Random random=new Random();
		
		for(int i=0; i < secondMatrice.length; i++) {
			
			for(int j=0; j < secondMatrice[0].length; j++) {
				
				secondMatrice[i][j]=random.nextInt(10);
				System.out.print(secondMatrice[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}
	
	//Matrisleri carpan metod
	public static void multiplyMatrices(int[][] firstMatrice, int[][] secondMatrice) {
		
		int[][] newMatrice = new int[firstMatrice.length][secondMatrice[0].length];
		
		for(int i=0; i < newMatrice.length; i++) {
			
			for(int j=0; j < newMatrice[0].length; j++) {
				
				int result = 0;
				for(int k=0; k < secondMatrice.length; k++) {
					result += firstMatrice[i][k] * secondMatrice[k][j];
				}
				newMatrice[i][j] = result;
			}
		
		}
		
		for(int i=0; i < newMatrice.length; i++) {
	
			for(int j=0; j < newMatrice[0].length; j++) {

					System.out.print(newMatrice[i][j] + " ");
					}

				System.out.print("\n");
			}
	}

}
