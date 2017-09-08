/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Lugares {
    private String nombre;
    private String clima;
    private String extensionT;
    private String habitantes;
    private String tipo_zona;
    private String año_fundacion;

    public Lugares() {
    }

    public Lugares(String nombre, String clima, String extensionT, String habitantes, String tipo_zona, String año_fundacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.extensionT = extensionT;
        this.habitantes = habitantes;
        this.tipo_zona = tipo_zona;
        this.año_fundacion = año_fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getExtensionT() {
        return extensionT;
    }

    public void setExtensionT(String extensionT) {
        this.extensionT = extensionT;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

    public String getTipo_zona() {
        return tipo_zona;
    }

    public void setTipo_zona(String tipo_zona) {
        this.tipo_zona = tipo_zona;
    }

    public String getAño_fundacion() {
        return año_fundacion;
    }

    public void setAño_fundacion(String año_fundacion) {
        this.año_fundacion = año_fundacion;
    }

    @Override
    public String toString() {
        return "Lugares{" + "nombre=" + nombre + ", clima=" + clima + ", extensionT=" + extensionT + ", habitantes=" + habitantes + ", tipo_zona=" + tipo_zona + ", a\u00f1o_fundacion=" + año_fundacion + '}';
    }
    
}
