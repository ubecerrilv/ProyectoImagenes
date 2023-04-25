package imagenes.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import imagenes.control.Comandos;

@SuppressWarnings("serial")
public class VentanaPrincipal extends VentanaAGeneral{
	
	JPanel central, derecho, imagenCentral, arriba, arribaBotones, vacio1;
	JFileChooser imagen;
	JButton regresar, siguiente, file;
	JLabel vacio;
	FileFilter filtro;
	public VentanaPrincipal(){
		super("Proyecto Tratamiento Imagenes");
		central = new JPanel(new GridLayout(1,1));
		central.setBorder(new EmptyBorder(5,5,5,5));
		derecho = new JPanel(new GridLayout(1,1));
		derecho.setBorder(new EmptyBorder(5,5,5,5));
		imagenCentral = new JPanel(new GridLayout(1,1));
		imagenCentral.setBorder(new EmptyBorder(5,5,5,5));
		
		arriba = new JPanel(new GridLayout(1,3));
		arriba.setBorder(new EmptyBorder(30,5,30,5));
		arribaBotones = new JPanel(new GridLayout(1,2));
		arribaBotones.setBorder(new EmptyBorder(0, 150, 0, 150));
		imagen = new JFileChooser();
		
		filtro = new FileNameExtensionFilter("PNG","png");
		imagen.addChoosableFileFilter(filtro);
		filtro = new FileNameExtensionFilter("JPG","jpg");
		imagen.addChoosableFileFilter(filtro);
		filtro = new FileNameExtensionFilter("JPEG","jpeg");
		imagen.addChoosableFileFilter(filtro);
		filtro = new FileNameExtensionFilter("TIFF","tiff");
		imagen.addChoosableFileFilter(filtro);

		vacio = new JLabel("");
		vacio1 = new JPanel(new GridLayout(1,1));
		
		regresar = new JButton("<=");
		regresar.setActionCommand(Comandos.REGRESA);
		regresar.addActionListener(this);
		siguiente = new JButton("=>");
		siguiente.setActionCommand(Comandos.SIGUIENTE);
		siguiente.addActionListener(this);
		file = new JButton("Elegir imagen");
		file.setActionCommand(Comandos.ELEGIR);
		file.addActionListener(this);
		
		arribaBotones.add(regresar);
		arribaBotones.add(siguiente);

		
		arriba.add(file);
		arriba.add(arribaBotones);
		arriba.add(vacio1);
		
		//imagenCentral.add(vacio);
		this.add(arriba, BorderLayout.NORTH);
		this.add(imagenCentral, BorderLayout.CENTER);
		
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case Comandos.ELEGIR:
			String ruta;
			
			imagen.showOpenDialog(this);
			ruta  = imagen.getSelectedFile().getPath();
			
			ImageIcon imagenReal = new ImageIcon(ruta);
			
			System.out.println(ruta);
		
			JLabel si = new JLabel();
			si.setIcon(imagenReal);
			imagenCentral.add(si);
			System.out.print("si");
			repaint();
			break;
			
		}
	}

}
