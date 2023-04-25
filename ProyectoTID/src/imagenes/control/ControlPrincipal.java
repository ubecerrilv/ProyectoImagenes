package imagenes.control;


import imagenes.gui.VentanaPrincipal;
import imagenes.modelo.Data;

public class ControlPrincipal extends ControlAbs{
	
/*
 * Esta clase es creada como un control de las ventanas, dirige cuando mostrase u ocultarse
 */
	
/**********************************************************************************************************************************************
 * 
 * 																ATRIBUTOS
 * 
 *********************************************************************************************************************************************/
	
	//private ControlVPrincipal CV;
	private VentanaPrincipal vent;
	
				
/**********************************************************************************************************************************************
 * 
 * 																M�TODOS
 * 
 *********************************************************************************************************************************************/

	public ControlPrincipal(ControlVPrincipal CVP, VentanaPrincipal venta) {
		this.vent = venta;
	}
	
	@Override
	public Data ejecutaComando(String c, Data d, Data d2) {
		switch(c) {
		case Comandos.INICIA:
			vent.setBounds(1080, 1920, 0, 0);
			vent.setLocationRelativeTo(null);			
			vent.setVisible(true);
		break;	
		}
		return null;	
		
	}

}//FIN CLASE
