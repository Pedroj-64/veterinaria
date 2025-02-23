package co.edu.uniquindio.poo;

import java.sql.Date;
import java.util.Collection;
import java.util.LinkedList;

public class Veterinario {

    private String nombre;
    private int idVeterinario;
    private Especializacion especializacion;
    private Date fechaDeNacimiento;
    private String numeroContacto;
    private String correo;
    private Collection<Mascota> pacientesACargo;

    /**
     * Metodo cosntructor del veterinario
     * 
     * @param nombre
     * @param idVeterinario
     * @param especializacion
     * @param fechaDeNacimiento
     * @param numeroContacto
     * @param correo
     * @param pacientesACargo
     */
    public Veterinario(String nombre, int idVeterinario, Especializacion especializacion, Date fechaDeNacimiento,
            String numeroContacto, String correo) {
        this.nombre = nombre;
        this.idVeterinario = idVeterinario;
        this.especializacion = especializacion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
        pacientesACargo = new LinkedList<>();

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
     * getter del id del veterinario
     * 
     * @return
     */
    public int getIdVeterinario() {
        return idVeterinario;
    }

    /**
     * setter del id del veterinario
     * 
     * @param idVeterinario
     */
    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    /**
     * getter de la especializacion del veterinario
     * 
     * @return
     */
    public Especializacion getEspecializacion() {
        return especializacion;
    }

    /**
     * setter de la especializacion
     * 
     * @param especializacion
     */
    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    /**
     * getter de la fecha de nacimiento
     * 
     * @return
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * setter de la fecha de nacimiento del veterinario
     * 
     * @param fechaDeNacimiento
     */
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * getter del numero del veterinario
     * 
     * @return
     */
    public String getNumeroContacto() {
        return numeroContacto;
    }

    /**
     * setter del numero de contacto
     * 
     * @param numeroContacto
     */
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    /**
     * getter del correo
     * 
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * setter correo
     * 
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * getter de la lista de pacientes a cargo
     * 
     * @return
     */
    public Collection<Mascota> getPacientesACargo() {
        return pacientesACargo;
    }

    /**
     * Metodo propio de la clase que verifica si existen en lista la mascota que se
     * quiere agregar
     * 
     * @param id
     * @return
     */
    public boolean existeIdMascota(int id) {
        boolean centinela = false;
        for (Mascota mascota : pacientesACargo) {
            if (mascota.getIdMascota() == (id)) {
                centinela = true;
            }

        }
        return centinela;

    }

    /**
     * Metodo para que el veterinario pueda agregar una mascota como paciente a su
     * cargo
     * 
     * @param mascota
     */
    public void agregarPaciente(Mascota mascota) {
        if (existeIdMascota(mascota.getIdMascota()) == false) {
            pacientesACargo.add(mascota);
        }

    }

    /**
     * Metodo para eliminar paciente a cargo del veterinario
     * 
     * @param id
     */
    public void eliminarPaciente(int id) {
        for (Mascota mascota : pacientesACargo) {
            if (mascota.getIdMascota() == id) {
                pacientesACargo.remove(mascota);
                break;
            }
        }

    }

    /**
     * metodo toString para modelado del codigo
     */
    @Override
    public String toString() {
        return "Veterinario [nombre=" + nombre + ", idVeterinario=" + idVeterinario + ", especializacion="
                + especializacion + ", fechaDeNacimiento=" + fechaDeNacimiento + ", numeroContacto=" + numeroContacto
                + ", correo=" + correo + ", pacientesACargo=" + pacientesACargo + "]";
    }

}
