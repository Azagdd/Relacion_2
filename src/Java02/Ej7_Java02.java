//Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta que son 
//años bisiestos los múltiplos de 4, excepto los que son también múltiplos de 100 pero no 
//lo son de 400.

package Java02;

import java.util.Scanner;

public class Ej7_Java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int year;
		
		System.out.println(" Introduce un año:  ");
		year = teclado.nextInt();
		
		if ((year%4==0) && (year%100 !=0)){
			System.out.println(" Es año bisiesto ");
		
		} else if ((year%4==0) && (year%100==0) && (year%400 !=0)) {
			System.out.println(" No es bisiesto ");
			
		} else if ((year%4==0) && (year%100==0) && (year%400==0)) {
			System.out.println(" Es año bisiesto ");
			
		} else if (year%4 !=0) {
			System.out.println(" No es año bisiesto ");
		
		}
		
	teclado.close();
	
		
		
	}

}
