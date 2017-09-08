/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Personas {
    private String nombre;
    private String id;
    private String lugar;
    private int edad;
    private int estatura;
    private String profesion;

    public Personas() {
    }

    public Personas(String nombre, String id, String lugar, int edad, int estatura, String profesion) {
        this.nombre = nombre;
        this.id = id;
        this.lugar = lugar;
        this.edad = edad;
        this.estatura = estatura;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", id=" + id + ", lugar=" + lugar + ", edad=" + edad + ", estatura=" + estatura + ", profesion=" + profesion + '}';
    }
    
}
