/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmn13_b;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
 
/**
 *
 * @author Chana
 */
public class Mmn13_b {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
      
        
        JFrame frame =new JFrame ("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        Sudoko s=new  Sudoko();
        frame.add(s);
        frame.setVisible(true);
        
    }
    
}
