package co.edu.uniquindio.poo;

import java.sql.Date;

public class App {
    public static void main(String[] args) {
    Veterinaria veterinaria=crearVeterinaria();
    Veterinario veterinario=crearVeterinario();
    Mascota mascota=crearMascota(veterinario);
    veterinario.agregarPaciente(mascota);


    imprimir( veterinario.toString());


    }

    public static Veterinaria crearVeterinaria(){
        Veterinaria veterinaria=new Veterinaria();
        return veterinaria;
    }

    public static Veterinario crearVeterinario(){
        Date fechaDeNaciemiento=Date.valueOf("1890-05-10");
        Veterinario veterinario=new Veterinario("Paco", 189, Especializacion.CARDIOLOGIA,fechaDeNaciemiento, "314959439", "vete@gmail.com");
        return veterinario;
    }

    public static Veterinario crearVeterinario2(){
        Date fechaDeNaciemiento=Date.valueOf("2000-05-30");
        Veterinario veterinario=new Veterinario("Ernestillo", 18, Especializacion.CARDIOLOGIA,fechaDeNaciemiento, "314959439", "veteri@gmail.com");
        return veterinario;
    }

    public static Mascota crearMascota(Veterinario veterinario){
        Mascota mascota=new Mascota("pepito", "Tigre montes", "atigrado", Genero.HEMBRA, "amarillo", 24.5, 193, Estado.RECUPERADO, veterinario);
        return mascota;
    }

    public static Mascota crearMascota2(Veterinario veterinario){
        Mascota mascota=new Mascota("Ramiris", "Tigre montes", "atigrado", Genero.HEMBRA, "amarillo", 24.5, 14, Estado.RECUPERADO, veterinario);
        return mascota;
    }

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    


}
