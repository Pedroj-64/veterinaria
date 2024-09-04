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
    public boolean verificiarIdVeterio(int id){
        boolean bandera=false;
        for(Veterinario veterinario: veterinarios){
            if(veterinario.getIdVeterinario()==id){
                bandera=true;
            }

        }
        return bandera;
        
    }
    public  void agregarVeterinario(boolean bandera,Veterinario veterinario){
        if(!bandera){
            veterinarios.add(veterinario);
        }else{
            System.out.println("El veterinario que intenta agregar ya se encuentra en el sistema");
        }

    }
    
    public void eliminarVeterinario(int id){
        for(Veterinario veterio: veterinarios){
            if(veterio.getIdVeterinario()==id){
                veterinarios.remove(veterio);
                break;
            }else{
                System.out.println("El veterinario que intenta eliminar del sistema no existe");
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
