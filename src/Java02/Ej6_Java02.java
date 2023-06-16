package Java02;

import java.util.Scanner;

public class Ej6_Java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double a1;
		double b1;
		double c1;
		double a2;
		double b2;
		double c2;
		
		System.out.println(" Introduce a1: ");
		a1 = teclado.nextInt();
		
		System.out.println(" Introduce el b1: ");
		b1 = teclado.nextInt();
		
		System.out.println(" Introduce c1: ");
		c1 = teclado.nextInt();
		
		System.out.println(" Introduce a2: ");
		a2 = teclado.nextInt();
		
		System.out.println(" Introduce b2: ");
		b2 = teclado.nextInt();
		
		System.out.println(" Introduce c2: ");
		c2 = teclado.nextInt();
		
		if (((a1/a2) != (b1/b2)) && ((a1/b1) == (-b2/a2))) {
		System.out.println(" Son secantes y perpendiculares ");
		
		}else if ((a1/a2) != (b1/b2)) {
			System.out.println(" Son secantes ");
			
		} else if (((a1/a2) != (b1/b2)) && ((a1/b1) == (-b2/a2))) {
			System.out.println(" Son secantes y perpendiculares ");
			
		} else if ((a1/a2 == b1/b2)) {
			System.out.println(" Son paralelas ");
			
		} else if (((a1/a2) == (b1/b2)) && ((a1/a2) == (b1/b2)) &&  ((b1/b2) == (c1/c2))) {
			System.out.println(" Son paralelas y coincidentes ");
		}
		
	teclado.close();
	
	}
	
}
