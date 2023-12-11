package ejercicio01;

/* Creamos las clases donde estarán definidas las funciones encargadas de calcular valores
 * y devolverlas al main. */

// Primero creamos la clase con sus atributos para después poder crear constructores.
public class Operaciones {
	double num1;
	double num2;

	// Crearemos uno sin parámetros para cumplir con lo dicho en el ejercicio...
	public Operaciones() {
		num1 = 0;

		num2 = 0;
	}

	// Y otro con parámetros.
	public Operaciones(double num1, double num2) {
		this.num1 = num1;

		this.num2 = num2;
	}

	// Luego empezamos a definir las diferentes funciones que iremos usando.
	public double Suma() {

		double result = num1 + num2;

		return result;
	}

	public double Resta() {

		double result = num1 - num2;

		return result;
	}

	public double Multiplicacion() {

		double result = num1 * num2;

		return result;
	}

	public double Division() {

		double result = num1 / num2;

		return result;
	}

	public double max() {

		double result = 0;

		if (num1 >= num2)
			result = num1;
		else
			result = num2;

		return result;
	}

	public double min() {

		double result = 0;

		if (num1 <= num2)
			result = num1;
		else
			result = num2;

		return result;
	}
}
