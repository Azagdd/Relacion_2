//Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar
//si están en la misma fila, columna, o en la misma diagonal.

package Java02;

import java.util.Scanner;

public class Ej5_Java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int fila1;
		int fila2;
		int columna1;
		int columna2;
		
		System.out.println(" Introduce la primera fila ");
		fila1 = teclado.nextInt();
		
		System.out.println(" Introduce la primera columna ");
		columna1 = teclado.nextInt();
		
		System.out.println(" Introduce la segunda fila ");
		fila2 = teclado.nextInt();
		
		System.out.println(" Introduce la segunda columna ");
		columna2 = teclado.nextInt();
		
		
		if ((fila1 == fila2) && (columna1 == columna2)) {
			System.out.println(" Son la misma pieza ");
		
		} else if (fila1 == fila2) {
			System.out.println(" Están en la misma fila ");
			
		} else if (columna1 == columna2) {
			System.out.println(" Están en la misma columna ");
			
		} else if (columna1 == columna2) {
			System.out.println(" Están en la misma fila ");
			
		} else if ((fila1-fila2) == -(columna1-columna2)) {
			System.out.println(" Están en la misma diagonal ");
			
		} else if ((fila2-fila1) == (columna2-columna1)) {
			System.out.println(" Están en la misma diagonal ");
			
		} else {
			System.out.println(" No coinciden ");
		}
		
	teclado.close();
	
	}

}
