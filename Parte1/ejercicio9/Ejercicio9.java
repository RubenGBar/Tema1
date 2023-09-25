package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		double pesetas;
		double resultadoEuros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las pesetas:");
		pesetas = sc.nextDouble();
		resultadoEuros = (pesetas/166);
		System.out.println("Esas pesetas son " + resultadoEuros + "€");
		sc.close();
	}

}
