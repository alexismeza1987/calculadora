package utils;

public class Ayudante {

	public static double conversor(String Valor){
	
		double valorConvertido = 0;
		
		try {
			valorConvertido = Double.parseDouble(Valor);
		} catch (NumberFormatException e) {
		
		}
		
		return valorConvertido;
		}
	
		public static double[] conversor(String[] valores){
			
			double[] auxiliar = new double [valores.length];
			
			for (int i = 0; i < valores.length; i++) {
				auxiliar[i] = conversor(valores[i]);
			}
			
			return auxiliar;
			
		}
	
}