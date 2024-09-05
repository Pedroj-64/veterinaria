package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {
    private String nombre = "Amigos peludos";
    private Collection<Mascota> pacientes;
    private Collection<Veterinario> veterinarios;

    /**
     * Metodo constructor de la clase veterinaria
     * 
     * @param pacientes
     * @param veterinarios
     */
    public Veterinaria() {
        pacientes = new LinkedList<>();
        veterinarios = new LinkedList<>();
    }

    /**
     * getter nombre
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter nombre
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de la lista pacientes
     * 
     * @return
     */
    public Collection<Mascota> getPacientes() {
        return pacientes;
    }

    /**
     * setter de la lista de pacientes
     * 
     * @param pacientes
     */
    public void setPacientes(Collection<Mascota> pacientes) {
        this.pacientes = pacientes;
    }

    /**
     * getter de la lista de veterinarios
     * 
     * @return
     */
    public Collection<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    /**
     * setter de la lista de veterinarios
     * 
     * @param veterinarios
     */
    public void setVeterinarios(Collection<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    /**
     * Metodo propio de la clase siento una forma de verificar si existen en lista
     * dicho veterinario
     * 
     * @param id
     * @return
     */
    public boolean existeVeterinario(int id) {
        boolean centinela = false;
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getIdVeterinario() == id) {
                centinela = true;
                break;
            }

        }
        return centinela;

    }

    /**
     * Metodo para agregar veterinario a amigos peludos
     * 
     * @param veterinario
     */
    public void agregarVeterinario(Veterinario veterinario) {
        if (existeVeterinario(veterinario.getIdVeterinario()) == false) {
            veterinarios.add(veterinario);
        }
    }

    /**
     * Metodo para eliminar veterinario afiliado a la veterinaria principal
     * 
     * @param id
     */
    public void eliminarVeterinario(int id) {
        for (Veterinario veterio : veterinarios) {
            if (veterio.getIdVeterinario() == id) {
                veterinarios.remove(veterio);
                break;
            }
        }

    }

    /**
     * Metodo que transpasa la lista de pacientes a cargo unitaria de cada
     * veterinario a pacientes de la veterinaria como forma de mejor administracion
     * 
     * @param pacienteACargo
     */
    public void agregarPacientes(Collection<Mascota> pacienteACargo) {
        pacientes.addAll(pacienteACargo);

    }

    /**
     * metodo toString para modelado de codigo
     */
    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", pacientes=" + pacientes + ", veterinarios=" + veterinarios + "]";
    }

}
