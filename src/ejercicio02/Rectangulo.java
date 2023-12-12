package ejercicio02;

/* Creamos las clases donde estarán definidas las funciones encargadas de calcular valores
 * y devolverlas al main. */


//Primero creamos la clase con sus atributos para después poder crear constructores.
public class Rectangulo {
	double alto;
	double ancho;

	// Crearemos uno sin parámetros para cumplir con lo dicho en el ejercicio...
	public Rectangulo() {
		alto = 0;

		ancho = 0;
	}
	
	// Y otro con parámetros.
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	// Luego empezamos a definir las diferentes funciones que iremos usando.
	public double perimetro() {
		double perimetroResult = 2 * (ancho + alto);
		
		return perimetroResult;
	}
	
	public double area() {
		double areaResult = ancho * alto;
		
		return areaResult;
	}
	
}
