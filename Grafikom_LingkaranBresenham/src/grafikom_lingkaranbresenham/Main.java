/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikom_lingkaranbresenham;
import javax.swing.JFrame;

/**
 *
 * @author  ANGGOTA KELOMPOK :
 * AIDIL AFANDI_17191322
 * MARVELINE PUTRI_17191156
 * ANSHORI DWI PUTRA_17190958
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame frame = new JFrame("Lingkaran");
        Lingkaran panel = new Lingkaran(150,150,100);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
