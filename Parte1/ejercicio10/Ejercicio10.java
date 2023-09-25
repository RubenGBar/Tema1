package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		final double IVA = 21;
		double precio, precioConIVA, aplicandoIVA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el precio a calcular el IVA:");
		precio = sc.nextDouble();
		aplicandoIVA = (IVA*precio)/100;
		precioConIVA = aplicandoIVA+precio;
		System.out.print("El precio con el IVA es de " + precioConIVA + "€");
		sc.close();
	}

}
