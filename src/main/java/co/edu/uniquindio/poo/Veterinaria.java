package co.edu.uniquindio.poo;

import java.util.Collection;

public class Veterinaria {
    private String nombre="Amigos peludos";
    private Collection<Mascota> pacientes;
    private Collection<Veterinario> veterinarios;

    /**
     * Metodo constructor de la clase veterinaria
     * @param pacientes
     * @param veterinarios
     */
    public Veterinaria( Collection<Mascota> pacientes, Collection<Veterinario> veterinarios) {
        this.pacientes = pacientes;
        this.veterinarios = veterinarios;
    }

    /**
     * getter nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de la lista pacientes
     * @return
     */
    public Collection<Mascota> getPacientes() {
        return pacientes;
    }

    /**
     * setter de la lista de pacientes
     * @param pacientes
     */
    public void setPacientes(Collection<Mascota> pacientes) {
        this.pacientes = pacientes;
    }

    /**
     * getter de la lista de veterinarios 
     * @return
     */
    public Collection<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    /**
     * setter de la lista de veterinarios
     * @param veterinarios
     */
    public void setVeterinarios(Collection<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
    /**
     * metodo toString para modelado de codigo
     */
    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", pacientes=" + pacientes + ", veterinarios=" + veterinarios + "]";
    }

    


    

}
