package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		String nombre;
		String direccion;
		String telefono;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduzca su dirección:");
		direccion = sc.nextLine();
		System.out.println("Introduzca su teléfono:");
		telefono = sc.nextLine();
		System.out.println(" ");
		System.out.println("Su nombre es " + nombre);
		System.out.println("Su dirección es " + direccion);
		System.out.println("Su número de teléfono es " + telefono);
		sc.close();
	}

}
