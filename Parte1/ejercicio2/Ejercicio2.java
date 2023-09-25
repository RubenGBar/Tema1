package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("Introduzca su edad:");
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		int p = ++numero;
		System.out.println("Su edad el proximo año será " + p + " años");
		sc.close();
		
		}


}
