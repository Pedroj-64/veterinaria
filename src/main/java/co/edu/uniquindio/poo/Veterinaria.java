package co.edu.uniquindio.poo;

import java.util.Collection;

public class Veterinaria {
    private String nombre="Amigos peludos";
    private Collection<Mascota> pacientes;
    private Collection<Veterinario> veterinarios;


    public Veterinaria( Collection<Mascota> pacientes, Collection<Veterinario> veterinarios) {

        this.pacientes = pacientes;
        this.veterinarios = veterinarios;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Collection<Mascota> getPacientes() {
        return pacientes;
    }


    public void setPacientes(Collection<Mascota> pacientes) {
        this.pacientes = pacientes;
    }


    public Collection<Veterinario> getVeterinarios() {
        return veterinarios;
    }


    public void setVeterinarios(Collection<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }


    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", pacientes=" + pacientes + ", veterinarios=" + veterinarios + "]";
    }

    


    

}
