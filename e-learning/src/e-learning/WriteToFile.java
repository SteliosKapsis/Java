/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmathisi1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class WriteToFile {
  public static void write(String line) {
             try (BufferedWriter writer = new BufferedWriter(new FileWriter("statistics.txt",true))){
            
                writer.write(line);
                writer.newLine();
                writer.close();
  } catch (IOException ex) {
                
            }
    }
}
