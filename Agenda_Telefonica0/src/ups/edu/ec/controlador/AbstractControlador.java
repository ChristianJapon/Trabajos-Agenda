/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japch
 */
public abstract class AbstractControlador<E> {
    public List<E> lista;
    public AbstractControlador(){
    lista = new ArrayList();
    }
    
    public boolean crear(E objeto){
        if (validar(objeto) )
            return lista.add(objeto);
        return false;
    }
    
    public E buscar(E comparacion){
        return lista.stream().filter(objeto -> objeto.equals(comparacion)).findFirst().get();
    }
    
    public boolean eliminar (E objeto){
        E objetoEliminar = buscar(objeto);
        return (objetoEliminar != null)? lista.remove(objetoEliminar): false;
    }
    
    public int buscarPosicion(E comparacion){
        for(int i=0; i<lista.size(); i++){
            E objeto = lista.get(i);
            if(objeto.equals(comparacion))
                return i;
        }
        return -1;
    }
    
    public boolean actualizar(E objeto){
       int index = buscarPosicion(objeto);
       if(index >0 && validar(objeto) == true){
            lista.set(index, objeto);
            return true;
       }
            return false;
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }
    
    public abstract boolean validar(E objeto);
    
}
