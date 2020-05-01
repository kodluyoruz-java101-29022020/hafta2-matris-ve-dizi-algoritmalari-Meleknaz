package algorithm.sample.matrice;

import java.util.Random;

public class Question1 {
	
public static void main(String[] args) {
		
		int[][] matrice=new int[5][5];
		System.out.println("input");
		printMatrice(matrice);
		System.out.println("output");
		newMatrice(matrice);
	}


//5x5 lik 0 ile 1 elemanlarini random olarak alan matrisi olusturdum
public static void printMatrice(int[][] matrice) {
	
	Random random=new Random();
	
	for(int i=0; i < matrice.length; i++) {
		
		for(int j=0; j < matrice[0].length; j++) {
			
			matrice[i][j]=random.nextInt(2);
			System.out.print(matrice[i][j] + " ");
		}
		
		System.out.print("\n");
	}
}

//Biraz cozum odaklý bir algoritma oldu umarim anlasilir ve gecerli bir cozumdur
public static void newMatrice(int[][] matrice) {
	
	for(int i=0; i < matrice.length; i++) {
		
		int count=0;
		
		for(int j=0; j < matrice[0].length; j++) {
			
			count=0;
			   if(j<4 && matrice[i][j+1]==1)
				   
			    count++;
			   
			   if(j>0 && matrice[i][j-1]==1)
				   
			    count++;
			   
			   if(i<4 && matrice[i+1][j]==1)
				   
			    count++;
			   
			   if(i>0 && matrice[i-1][j]==1)
				   
			    count++;
			   
			   if(count<2 && matrice[i][j]==1) 
				   
				   matrice[i][j]=0;
			   
			   if((count<=3 && count>=2) && matrice[i][j]==1)
				   
				   matrice[i][j]=1;
			   
			   if(count>3 && matrice[i][j]==1)
				   
				   matrice[i][j]=0;
			   
			   if(count==3 && matrice[i][j]==0)
				   
				   matrice[i][j]=1;
		}
			  
	}
			  
		
		for(int i=0; i < matrice.length; i++) {
	
				for(int j=0; j < matrice[0].length; j++) {
		
					System.out.print(matrice[i][j] + " ");
				}
	
		System.out.print("\n");
			}
		}
}



