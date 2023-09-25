package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		String nombre;
		String edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduzca su edad:");
		edad = sc.nextLine();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		sc.close();
	}

}
