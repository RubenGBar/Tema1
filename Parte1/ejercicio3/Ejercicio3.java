package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("Introduzca su año de nacimiento");
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		int Actual;
		Actual = 2023;
		int resultado;
		resultado = Actual-numero;
		System.out.println("Gracias, su edad es de " + resultado + " años");
		sc.close();
	}

}
