package parte2ejercicio5;

import java.util.Scanner;

public class Parte2ejercicio5 {
	public static void main(String[] args) {
		double primer;
		double segundo;
		double tercero;
		double notaFinal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la nota del primer trimestre: ");
		primer = sc.nextInt();
		System.out.println("Introduzca la nota del primer trimestre: ");
		segundo = sc.nextInt();
		System.out.println("Introduzca la nota del tercer trimestre: ");
		tercero = sc.nextInt();
		notaFinal = (primer+segundo+tercero)/3;
		System.out.println("Su nota final es " + (int)notaFinal);
		System.out.println("Su nota del boletín de notas es: " + notaFinal);
		sc.close();
	}
}
