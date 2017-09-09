
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Lugares extends Thread{
    private String nombre;
    private String clima;
    private String extensionT;
    private String habitantes;
    private String tipo_zona;
    private String año_fundacion;
    private ArrayList<Personas> lista = new ArrayList();

    public Lugares() {
    }

    public Lugares(String nombre, String clima, String extensionT, String habitantes, String tipo_zona, String año_fundacion, ArrayList lista) {
        this.nombre = nombre;
        this.clima = clima;
        this.extensionT = extensionT;
        this.habitantes = habitantes;
        this.tipo_zona = tipo_zona;
        this.año_fundacion = año_fundacion;
        this.lista = lista;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
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
    
    public void run() {
        
        principal2 nuevo = new principal2();
        nuevo.pack();
        nuevo.setLocationRelativeTo(null);
        nuevo.jl.setText(nombre);
        nuevo.setVisible(true);
        while (true) {            
            nuevo.jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "ID", "Lugar"
            }
        ));
            DefaultTableModel modelo = (DefaultTableModel) nuevo.jTable1.getModel();
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getLugar().equals(nombre)) {
                    Object [] newrow = {lista.get(i).getNombre(),lista.get(i).getEdad(),lista.get(i).getId(),lista.get(i).getLugar()};
                    modelo.addRow(newrow);
                    nuevo.jTable1.setModel(modelo);
                }
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
        
    }
    
}
