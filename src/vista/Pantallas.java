package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pantallas {
		
	public String ingresarValor (String mensajePublicar){
			
		JFrame frame = new JFrame();
					
		String ingresado = JOptionPane.showInputDialog(frame, mensajePublicar, "");
		
		return ingresado;

	}
	
	public void mostrarMensaje (String mensaje){
	
		JFrame frame = new JFrame("etc");
	
		JOptionPane.showMessageDialog(frame, mensaje);


	}
	
}
