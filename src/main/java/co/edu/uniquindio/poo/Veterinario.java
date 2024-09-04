package co.edu.uniquindio.poo;

import java.sql.Date;
import java.util.Collection;

public class Veterinario {

    private String nombre;
    private int idVeterinario;
    private Especializacion especializacion;
    private Date fechaDeNacimiento;
    private String numeroContacto;
    private String correo;
    private Collection<Mascota> pacientesACargo;


    public Veterinario(String nombre,int idVeterinario,Especializacion especializacion,Date fechaDeNacimiento,String numeroContacto,String correo,Collection<Mascota> pacientesACargo){
        this.nombre=nombre;
        this.idVeterinario=idVeterinario;
        this.especializacion=especializacion;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.numeroContacto=numeroContacto;
        this.correo=correo;
        this.pacientesACargo=pacientesACargo;

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Collection<Mascota> getPacientesACargo() {
        return pacientesACargo;
    }

    @Override
    public String toString() {
        return "Veterinario [nombre=" + nombre + ", idVeterinario=" + idVeterinario + ", especializacion="
                + especializacion + ", fechaDeNacimiento=" + fechaDeNacimiento + ", numeroContacto=" + numeroContacto
                + ", correo=" + correo + ", pacientesACargo=" + pacientesACargo + "]";
    }



}
