
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
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
public class adminHilo implements Runnable {

    protected JFrame f;
    ArrayList<Personas> lista = new ArrayList();

    public adminHilo(JFrame f) {
        this.f = f;
    }

    public JFrame getF() {
        return f;
    }

    public void setF(JFrame f) {
        this.f = f;
    }
    

    @Override
    public void run() {
        principal2 nuevo = new principal2();
        nuevo.pack();
        nuevo.setLocationRelativeTo(null);
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
        }
    }
}
