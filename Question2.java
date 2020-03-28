package hafta_2_odevi;

public class Question2 {

	//Bu soruda sadece ilk iki if() kismini çalistirabildim
	//Tekrar bakicam umarim yapabilirim
	
	public static void main(String[] args) {
		
		int [][] matrice={
            {1,2,3,4,5},
            {16,17,18,19,6},
            {15,24,25,20,7},
            {14,23,22,21,8},
            {13,12,11,10,9},
            
        };
		  
		for(int i=0; i < matrice.length; i++) {
			
			for(int j=0; j < matrice[0].length; j++) {
				
				if(i==0 && j < matrice[0].length)
					System.out.print(matrice[i][j] + "  ");
				
				if(i > 0 && j==matrice[0].length-1)
					System.out.print(matrice[i][j] + " ");
				
				/*if(i==matrice.length-1 && j < matrice[0].length-1)
					System.out.print(matrice[i][j] + " ");
				
				if((i<matrice.length-1 && i>0) && j==0)
					System.out.print(matrice[i][j] + " ");
				
				if(i==1 && (j>0 && j< matrice[0].length-1))
					System.out.print(matrice[i][j] + " ");*/
			}
		}
	}

}
