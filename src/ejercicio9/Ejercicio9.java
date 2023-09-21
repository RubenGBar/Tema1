package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		double pesetas;
		double relacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las pesetas:");
		pesetas = sc.nextDouble();
		
		System.out.println("Las" + pesetas + " ptas. son ");
		sc.close();
	}

}
