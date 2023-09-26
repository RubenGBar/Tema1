package parte2jerecicio4;

import java.util.Scanner;

public class Parte2jerecicio4 {
	public static void main(String[] args) {
		boolean salir;
		boolean biblioteca;
		boolean lluvia;
		boolean tareas;
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor, escriba sólo true o false");
		System.out.println("¿Has terminado tus tareas?");
		tareas = sc.nextBoolean();
		System.out.println("¿Está lloviendo?");
		lluvia = sc.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		salir = biblioteca || (!lluvia&&tareas);
		System.out.println("¿Puedes salir a la calle? " + salir);
		sc.close();
	}

}
