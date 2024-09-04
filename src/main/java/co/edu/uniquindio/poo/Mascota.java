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
    /**
     * Constructor de la clase mascota
     * @param nombre
     * @param especie
     * @param raza
     * @param genero
     * @param color
     * @param peso
     * @param idMascota
     */
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
    /**
     * setter nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * getter nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * setter especie
     * @param especie
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * getter especie
     * @return
     */
    public String getEspecie() {
        return especie;
    }
    /**
     * setter raza
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    /**
     * getter raza
     * @return
     */
    public String getRaza() {
        return raza;
    }
    /**
     * setter genero
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * getter genero
     * @return
     */
    public String getGenero() {
        return genero;
    }
    /**
     * setter color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * getter color
     * @return
     */
    public String getColor() {
        return color;
    }
    /**
     * setter peso
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * getter peso de mascota
     * @return
     */
    public double getPeso() {
        return peso;
    }
    /**
     * setter id de mascota
     * @param idMascota
     */
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    /**
     * getter id de la mascota
     * @return
     */
    public int getIdMascota() {
        return idMascota;
    }
    /**
     * setter del estado de la mascota
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    /**
     * getter estado de la mascota
     * @return
     */
    public Estado getEstado() {
        return estado;
    }
    /**
     * Metodo toString para dar un modelado mejor al codigo
     */
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", genero=" + genero
                + ", color=" + color + ", peso=" + peso + ", idMascota=" + idMascota + ", estado=" + estado + "]";
    }

}
