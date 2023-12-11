package ejercicio01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

	/* Crearemos una clase principal y una clase operaciones que harán las funciones típicas de una
	 * calculadora, pero le sumaremos dos funciones más. Una nos dará el máximo de dos números dados
	 * y otra nos dará el mínimo de dichos números.
	 * 
	 * La idea es enseñarle al usuario un menú, preguntarle qué operación quiere hacer, luego pedirle
	 * que introduzca dos números (SÓLO EN EL MAIN), y hacer la operación que pidió el usuario. La
	 * gracia de esto es que todo va a ir en su respectiva función dentro de la clase que le
	 * corresponda según lo explicado en el ejercicio.*/
	
	/* Crearemos el Scanner que usarán las funciones. Lo hacemos estático para poder luego en el
	 * main cerrar el Scanner correctamente sin que dé excepciones. (Quizás esta parte sea la
	 * parte que más se podría mejorar. Soy consciente de que no es común que en los
	 * ejercicios el Scanner sea estático). */
	static Scanner sc = new Scanner(System.in);
	
	// Creamos la función menu para poder ejecutarla luego en el Main.
	public static int menu() {
		
		// Crearemos la variable para devolverla al main según especifica el ejercicio.
		int userRes = 0;

		// Mostramos el menú para informar al usuario.
		System.out.println("Introduzca un número para elegir una de las siguientes opciones:" + "\n");

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir" + "\n");

		// Pedimos el valor al usuario para luego devolverlo.
		userRes = (int) pideNumero();

		return userRes;
	}
	
	// Crearemos la función responsable de pedir valores al usuario para ahorrar código y para cumplir con lo establecido.
	public static double pideNumero() {
		/* Lo inicializamos a -1 para que el usuario pueda detener la ejecución del programa en
		 * cualquier momento en la función menu. */
		double userInput = -1;
		
		/* Hacemos el bucle do while con un try-catch para que cumpla lo que dice el ejercicio
		 * y para que no se introduzcan valores érroneos. */
		do {
			try {
				userInput = sc.nextDouble();
			} catch(InputMismatchException e) {
				System.err.println("Error. Has introducido un valor no válido. Vuelve a intentarlo.");
				sc.next();
			}
		} while(userInput == -1);
		
		
		
		return userInput;
	}

	public static void main(String[] args) {
		
		// Creamos la variable que será usado para saber qué operación usará el usuario.
		
		int userRes = 0;
		
		// Creamos los dos valores con los que se van a operar.
		double num1 = 0;
		double num2 = 0;
		
		// Creamos el resultado para poder luego imprimirla en pantalla.
		double result = 0;
		
		// Ejecutamos la función menu.
		userRes = menu();
		
		// Si el usuario es 0, no nos interesa seguir con el programa. Por lo que imprimimos sólo un mensaje.
		if(userRes == 0) {
			System.out.println("Saliendo del programa...");
		} else {
			// Si ha introducido otra cosa que no sea un 0, sigue con la ejecución del programa.
			System.out.println("Introduzca dos números a continuación:");
			
			// Invocamos la función para registrar los números.
			num1 = pideNumero();
			num2 = pideNumero();
			
			// Creamos un objeto con los valores de referencia.
			Operaciones operacion = new Operaciones(num1, num2);
			
			
			// Y hacemos un Switch para saber qué hacer en cada caso.
			switch(userRes) {
			
			// Suma
			case 1:
				result = operacion.Suma();
				System.out.println("La suma de " + operacion.num1 + " + " + operacion.num2 + " es: " + result);
				break;
			// Resta
			case 2:
				result = operacion.Resta();
				System.out.println("La resta de " + operacion.num1 + " - " + operacion.num2 + " es: " + result);
				break;
				
			// Multiplicación
			case 3:
				result = operacion.Multiplicacion();
				System.out.println("La multiplicación de " + operacion.num1 + " x " + operacion.num2 + " es: " + result);
				break;
				
			// División
			case 4:
				result = operacion.Division();
				System.out.println("La división de " + operacion.num1 + " entre " + operacion.num2 + " es: " + result);
				break;
				
			// Máximo
			case 5:
				result = operacion.max();
				System.out.println("El máximo de " + operacion.num1 + " y " + operacion.num2 + " es: " + result);
				break;
				
			// Mínimo
			case 6:
				result = operacion.min();
				System.out.println("El mínimo de " + operacion.num1 + " y " + operacion.num2 + " es: " + result);
				break;
			default:
				System.out.println("Saliendo del programa...");
			
				
			}
		}
		
		// Cerramos el Scanner.
		sc.close();
	}

}
