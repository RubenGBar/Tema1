package parte2ejercicio3;

import java.util.Scanner;

public class Parte2ejercicio3 {
	public static void main(String[] args) {
		int numero;
		int div;
		boolean par;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		div = numero%2 ;
		par = div==0;
		
		System.out.println("¿El número es par? " + par);
		sc.close();
	}

}
