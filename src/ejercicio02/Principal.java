package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio01.Operaciones;

public class Principal {

static Scanner sc = new Scanner(System.in);
	
	// Creamos la función menu para poder ejecutarla luego en el Main.
	public static int menu() {
		
		// Crearemos la variable para devolverla al main según especifica el ejercicio.
		int userRes = 0;

		// Mostramos el menú para informar al usuario.
		System.out.println("Introduzca un número para elegir una de las siguientes opciones:" + "\n");

		System.out.println("1. Perímetro");
		System.out.println("2. Área");
		System.out.println("0. Salir" + "\n");

		// Pedimos el valor al usuario para luego devolverlo y saber qué opción ha escogido.
		userRes = sc.nextInt();

		return userRes;
	}
	
	// Crearemos la función responsable de pedir el ancho del rectángulo para cumplir con lo establecido.
	public static double pideAncho() {
		
		double userAncho = 0;
		
		// Hacemos el bucle do while con un try-catch para que no se introduzcan valores érroneos.
		do {
			try {
				System.out.print("\n" + "Introduce el ancho del rectángulo: ");
				userAncho = sc.nextDouble();
				System.out.println();
			} catch(InputMismatchException e) {
				System.err.println("Error. Has introducido un valor no válido. Vuelve a intentarlo.");
				sc.next();
			}
		} while(userAncho == 0);
		
		
		
		return userAncho;
	}

	// Creamos la misma función pero para el Alto.
	public static double pideAlto() {
		
		double userAlto = 0;
		
		do {
			try {
				System.out.print("Introduce el alto del rectángulo: ");
				userAlto = sc.nextDouble();
				System.out.println();
			} catch(InputMismatchException e) {
				System.err.println("Error. Has introducido un valor no válido. Vuelve a intentarlo.");
				sc.next();
			}
		} while(userAlto == 0);
		
		
		
		return userAlto;
	}
	
	public static void main(String[] args) {
		
		// Creamos la variable que será usado para saber qué operación usará el usuario.
		
		int userRes = 0;
		
		// Creamos los dos valores con los que se van a operar.
		double alto = 0;
		double ancho = 0;
		
		// Creamos el resultado para poder luego imprimirla en pantalla.
		double result = 0;
		
		// Le preguntamos por los dos valores a introducir.
		System.out.println("Introduzca dos números a continuación:" + "\n");
					
		// Invocamos lad funciones para registrar los números.
		alto = pideAlto();
		ancho = pideAncho();
		
		
		// Ejecutamos la función menu.
		userRes = menu();
		
		// Si el valor del usuario es 0, no nos interesa seguir con el programa. Por lo que imprimimos sólo un mensaje.
		if(userRes == 0) {
			System.out.println("Saliendo del programa...");
		} else {
			
			
			// Creamos un objeto con los valores de referencia.
			Rectangulo rectangulo = new Rectangulo(alto, ancho);
			
			
			// Y hacemos un Switch para saber qué hacer en cada caso.
			switch(userRes) {
			
			// Perímetro
			case 1:
				result = rectangulo.perimetro();
				System.out.println("El perímetro de un rectángulo teniendo de alto " + rectangulo.alto + " y " +
				rectangulo.ancho + " de ancho es: " + result);
				break;
				
				
			// Área
			case 2:
				result = rectangulo.area();
				System.out.println("El área de un rectángulo teniendo de alto " + rectangulo.alto + " y " +
				rectangulo.ancho + " de ancho es: " + result);
				break;
				

			default:
				System.out.println("Saliendo del programa...");
			
				
			}
		}
		
		// Cerramos el Scanner.
		sc.close();
	}
	
	}


