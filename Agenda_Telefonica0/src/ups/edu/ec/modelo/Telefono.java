/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.Objects;

/**
 *
 * @author japch
 */
public class Telefono {
    
    private int id;
    private String numero;
    private Persona propietario;    

    public Telefono(int id, String numero, Persona propietario) {
        this.id = id;
        this.numero = numero;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.numero);
        hash = 17 * hash + Objects.hashCode(this.propietario);
        return hash;
    }

      
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.propietario, other.propietario)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Telefono{" + "id=" + id + ", numero=" + numero + ", propietario=" + propietario + '}';
    }
    
    
}
