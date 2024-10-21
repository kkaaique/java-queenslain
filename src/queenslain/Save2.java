/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queenslain;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

/**
 *
 * @author Vinicius
 */
public class Save2 {
    public static void salvador(String[] argument) throws IOException {
     BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Vinicius\\Documents\\QueenSlainv2final\\log.txt"));
bw.write("teste1");    
    bw.close();
    
    
    }
    }
