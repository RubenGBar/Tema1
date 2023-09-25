package parte2ejercicio2;

import java.util.Scanner;

public class Parte2ejercicio2 {
	public static void main(String[] args) {
		int edad;
		String mayoría;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad");
		edad = sc.nextInt();
		mayoría = edad <= 18 ? "Usted es menor de edad" : "Usted es mayor de edad";
		
		System.out.println(mayoría);
		sc.close();
	}

}
