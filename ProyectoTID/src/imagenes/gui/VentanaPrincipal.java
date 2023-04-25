package imagenes.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class VentanaPrincipal extends VentanaAGeneral{
	
	JPanel central, derecho, imagenCentral, arriba, arribaBotones;
	JFileChooser imagen;
	JButton regresar, siguiente;
	
	public VentanaPrincipal(){
		super("Proyecto Tratamiento Imagenes");
		central = new JPanel(new GridLayout(1,1));
		central.setBorder(new EmptyBorder(5,5,5,5));
		derecho = new JPanel(new GridLayout(1,1));
		derecho.setBorder(new EmptyBorder(5,5,5,5));
		arriba = new JPanel(new GridLayout(1,3));
		arriba.setBorder(new EmptyBorder(5,5,5,5));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
