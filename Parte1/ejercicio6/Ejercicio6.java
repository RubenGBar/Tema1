package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dos números cualesquiera.");
		System.out.println("Primer número:");
		a = sc.nextDouble();
		System.out.println("Segundo número");
		b = sc.nextDouble();
		System.out.println("La suma de los números es " + (a+b));
		System.out.println("La resta de los números es " + (a-b));
		System.out.println("La multplicación de los números es " + a*b);
		System.out.println("La división es " + a/b);
		sc.close();
	}

}
