package utils;

public class Suma implements Operaciones{
	
	public Suma(){}
	
	public double Suma( String operador, double a, double b ){
		return operacion( "+", a, b);
	}
	
	public double Suma( String operador, double a, double b, double c ){
		return operacion( "+", a, b, c);
	}
	
	public double Suma( String operador, double a, double b, double c, double d ){
		return operacion( "+", a, b, c, d);
	}
	
	public double Suma( String operador, double...parametros ){
		return operacion( "+", parametros);
	}

	@Override
	public double operacion(String operador, double... parametros) {
		
		double acumulador = 0;
		
		for (int i = 0; i < parametros.length; i++) {
			acumulador += parametros[ i ];
		}
		
		return acumulador;
	}

	@Override
	public double operacion(String operador, double a, double b) {
		return a+b;
	}

	@Override
	public double operacion(String operador, double a, double b, double c) {
		return a+b+c;
	}

	@Override
	public double operacion(String operador, double a, double b, double c, double d) {
		return a+b+c+d;
	}

}
