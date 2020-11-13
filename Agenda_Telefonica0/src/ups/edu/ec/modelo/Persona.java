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
public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String numero;
    
    public Persona(){
        
    }

    public Persona(int id, String nombre, String apellido, String cedula, String numero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numero = numero;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellido);
        hash = 29 * hash + Objects.hashCode(this.cedula);
        hash = 29 * hash + Objects.hashCode(this.numero);
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
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
       
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", numero=" + numero + '}';
    }
 
    
    
}
