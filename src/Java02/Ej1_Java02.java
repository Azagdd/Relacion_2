//  Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son iguales


package Java02;

import java.util.Scanner;

public class Ej1_Java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Introduce el primer número ");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número ");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
		    System.out.println(+num1+ " es mayor que " +num2);
		}
		    
		    else if (num1 < num2) {
			    System.out.println(+num1+ " es menor que " +num2);
		    }
		
		    else if (num1 == num2) {
			    System.out.println(+num1+ " es igual que " +num2);
		    }

		teclado.close();
	}

}
