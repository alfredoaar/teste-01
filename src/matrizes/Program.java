package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Digite um numero que pertence à matriz:");
		int numero = sc.nextInt();
		

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numero) {
					
				System.out.println("Posição do numero: "+i+", "+j);
				
                   if(j>0) {System.out.println("LEFT: "+ matriz[i][j-1]);}
                   if(i>0) {System.out.println("UP: "+ matriz[i-1][j]);}
                   if(j<matriz[i].length-1) {System.out.println("RIGHT: "+ matriz[i][j+1]);}
                   if(i<matriz.length-1) {System.out.println("DOWN: "+ matriz[i+1][j]);}
				}
			}
		}

		sc.close();

	}

}
