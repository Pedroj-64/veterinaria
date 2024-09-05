package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {
    private String nombre="Amigos peludos";
    private Collection<Mascota> pacientes;
    private Collection<Veterinario> veterinarios;

    /**
     * Metodo constructor de la clase veterinaria
     * @param pacientes
     * @param veterinarios
     */
    public Veterinaria() {
        pacientes= new LinkedList<>();
        veterinarios= new LinkedList<>();
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


    public boolean existeVeterinario(int id){
        boolean centinela=false;
        for(Veterinario veterinario: veterinarios){
            if(veterinario.getIdVeterinario()==id){
                centinela=true;
                break;
            }

        }
        return centinela;
        
    }
    public   void agregarVeterinario(Veterinario veterinario){
        if(existeVeterinario(veterinario.getIdVeterinario())==false){
            veterinarios.add(veterinario);
        }
    }
    
    public void eliminarVeterinario(int id){
        for(Veterinario veterio: veterinarios){
            if(veterio.getIdVeterinario()==id){
                veterinarios.remove(veterio);
                break;
            }
        }

    }

    public  void agregarPacientes(Collection<Mascota> pacienteACargo){
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
