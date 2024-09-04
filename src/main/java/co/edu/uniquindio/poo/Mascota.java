package co.edu.uniquindio.poo;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private String genero;
    private String color;
    private double peso;
    private int idMascota;
    private Estado estado;

    public Mascota(String nombre, String especie, String raza, String genero, String color, double peso,
            int idMascota) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
        this.idMascota = idMascota;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", genero=" + genero
                + ", color=" + color + ", peso=" + peso + ", idMascota=" + idMascota + ", estado=" + estado + "]";
    }

}
