import controlador.Logica;
import vista.Pantallas;

public class Aplication {

	public static void main(String[] args) {
		
		Pantallas vista = new Pantallas();
		Logica controlador = new Logica();
		
		String valorIngresado = vista.ingresarValor("Calculadora");
		
		vista.mostrarMensaje("El resultado es: " + controlador.calcular(valorIngresado));
		
		
	}
	
}
