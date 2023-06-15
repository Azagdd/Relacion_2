// Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
// posición central si los tres se ordenasen.

package Java02;

import java.util.Scanner;

public class Ej3_Java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		float num1;
		float num2;
		float num3;
		
		System.out.println("Introduce el primer número ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número ");
		num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número ");
		num3 = teclado.nextInt();
		
		if (num1 > num2 && (num1 < num3)) {
			System.out.println("El central es " +num1);
			
		} else if (num1 > num3 && (num1 < num2)) {
			System.out.println("El central es " +num1);
			
		} else if (num2 > num1 && (num2 < num3)) {
			System.out.println("El central es " +num2);
			
		} else if (num2 > num3 && (num2 < num1)) {
			System.out.println("El central es " +num2);
			
		} else if (num3 > num1 && (num3 < num2)) {
			System.out.println("El central es " +num3);
			
		} else if (num3 > num2 && (num3 < num1)) {
			System.out.println("El central es " +num3);
		}
		
	teclado.close();
	}

}
