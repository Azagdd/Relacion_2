// Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un 
// triángulo con esas dimensiones. 

package Java02;

import java.util.Scanner;

public class Ej4_Java02 {

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
		
		if ((num1+num2>num3) && (num2+num3>num1) && (num3+num1>num2))  {
			System.out.println(" El triángulo es posible ");
		} else {
			System.out.println(" No es posible el triángulo ");
		}
		
	teclado.close();
	}

}
