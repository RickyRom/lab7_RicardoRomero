
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricky
 */
public class adminHilo extends Thread {

    protected JDialog d;

    public adminHilo(JDialog d) {
        this.d = d;
    }

    @Override
    public void run() {
        JDialog D = new JDialog();
        D = d;
        D.pack();
        D.setLocationRelativeTo(null);
        D.setVisible(true);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

}
