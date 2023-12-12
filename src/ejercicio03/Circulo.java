package ejercicio03;

public class Circulo {
	double radio;
	
	// Crearemos uno sin parámetros para cumplir con lo dicho en el ejercicio...
		public Circulo() {
			radio = 0;
		}
		
		// Y otro con parámetros.
		public Circulo(double radio) {
			this.radio = radio;
		}
		
		// Luego empezamos a definir las diferentes funciones que iremos usando.
		public double circunferencia() {
			double perimetroResult = 2 * Math.PI * radio;
			
			return perimetroResult;
		}
		
		public double area() {
			double areaResult = Math.pow(radio, 2) * Math.PI;
			
			return areaResult;
		}
}
