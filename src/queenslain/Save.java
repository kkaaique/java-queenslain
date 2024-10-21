/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queenslain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Vinicius
 */
public class Save extends Table{   
    
    public void Salvar(int contador) throws IOException{
        
        BufferedWriter  bw = new BufferedWriter(new FileWriter("log.txt"));
        
        try {
           
            bw.write("O jogador teve " + contador + "tentativas antes de finalizar o jogo.");
            
            if (VerificarVencedor() == true){
            bw.write("O jogador conseguiu vencer o jogo.");
            } else {
                bw.write("O jogador perdeu.");
                
            }
        } catch (Exception ex) {
            System.out.println(ex.getClass());
        } finally {
            bw.close();
        }
        
    }
}
        
        
    

    