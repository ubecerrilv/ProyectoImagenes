package imagenes.principal;

import imagenes.control.Comandos;
import imagenes.control.ControlPrincipal;
import imagenes.control.ControlVPrincipal;
import imagenes.gui.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		//VARIABLES NECESARIAS
				ControlPrincipal CP; //Control principal
				
				VentanaPrincipal Vent;
				ControlVPrincipal CV; //VENTANA Y SU CONTROL
				
				//CREACION DE LOS OBJETOS
				CV = new ControlVPrincipal();
				Vent = new VentanaPrincipal();
				
				CP = new ControlPrincipal(CV, Vent);//VENTANA Y CONTROL EN EL PRINCIPAL
				
				
				//CONTROL DE LA VENTANA
				Vent.setControl(CV);
				
				
				//INICIA EL PROGRAMA
				CP.ejecutaComando(Comandos.INICIA, null, null);
	}

}
