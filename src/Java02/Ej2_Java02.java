// Algoritmo que pida 3 números e indique cual es el menor de los tres.

package Java02;

import java.util.Scanner;

public class Ej2_Java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduce el primer número ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número ");
		num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número ");
		num3 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El menor es " +num2);
			
		} else if (num1 > num3) {
				System.out.println("El menor es " +num3);
			
		} else if (num2 > num1) {
			 System.out.println("El menor es " +num1);
			 
		} else if (num2 > num3) {
			System.out.println("El menor es " +num3);
		
		} else if (num3 > num1) {
			 System.out.println("El menor es " +num1);
			 
		} else if (num3 > num2) {
			 System.out.println("El menor es " +num2);
		}
		
		teclado.close();	
	}

}

