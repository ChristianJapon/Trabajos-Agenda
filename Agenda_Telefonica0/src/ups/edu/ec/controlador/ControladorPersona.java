/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.Persona;

/**
 *
 * @author japch
 */
public class ControladorPersona extends AbstractControlador<Persona> {
    @Override
    public boolean validar(Persona objeto) {
    return !objeto.getNombre().equals(objeto.getApellido());
    }
    

/*
    private List<Persona> listPersona;
      public ControladorPersona(){
    	listPersona = new ArrayList<Persona>();


    public Persona get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Persona> listar(){
	return this.listPersona;
}*/
}
