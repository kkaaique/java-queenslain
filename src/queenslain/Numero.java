/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queenslain;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class Numero {
    
    protected int numQueens = 0;
    
    
    
      public boolean checkNumQueens() {
        if (this.numQueens < 4) {
             this.numQueens += 1;
             return true;
        }else {
            JOptionPane.showMessageDialog(null, "Você pode usar apenas 4 Rainhas!");
            return false;
        }
    }
      
      public void resetNumQueens(){
          this.numQueens = 0;
      }
    
}
