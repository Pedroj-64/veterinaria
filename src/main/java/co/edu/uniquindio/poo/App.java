package co.edu.uniquindio.poo;

import java.sql.*;

public class App {
    public static void main(String[] args) {
        Veterinaria veterinaria = crearVeterinaria();
        imprimir(veterinaria.toString());
        Veterinario veterinario = crearVeterinario();
        veterinaria.agregarVeterinario(veterinario);
        imprimir(veterinaria.toString());
        Mascota mascota = crearMascota();
        Mascota mascota2 = crearMascota2();
        veterinario.agregarPaciente(mascota);
        veterinario.agregarPaciente(mascota2);
        imprimir(veterinario.toString());
        veterinaria.agregarPacientes(veterinario.getPacientesACargo());
        imprimir(veterinaria.toString());
    }

    public static Veterinaria crearVeterinaria() {
        Veterinaria veterinaria = new Veterinaria();
        return veterinaria;
    }

    public static Veterinario crearVeterinario() {
        Date fechaDeNacimiento = Date.valueOf("1999-05-01");
        Veterinario veterinario = new Veterinario("Paco", 189, Especializacion.CARDIOLOGIA, fechaDeNacimiento,
                "314959439", "vete@gmail.com");
        return veterinario;
    }

    public static Veterinario crearVeterinario2() {
        Date fechaDeNacimiento = Date.valueOf("2000-04-05");
        Veterinario veterinario = new Veterinario("Ernestillo", 189, Especializacion.ONCOLOGIA, fechaDeNacimiento,
                "314959439", "veteri@gmail.com");
        return veterinario;
    }

    public static Mascota crearMascota() {
        Mascota mascota = new Mascota("pepito", "Tigre montes", "atigrado", Genero.HEMBRA, "amarillo", 24.5, 193,
                Estado.RECUPERADO);
        return mascota;
    }

    public static Mascota crearMascota2() {
        Mascota mascota = new Mascota("Ramiris", "Tigre montes", "atigrado", Genero.HEMBRA, "amarillo", 24.5, 193,
                Estado.RECUPERADO);
        return mascota;
    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

}
