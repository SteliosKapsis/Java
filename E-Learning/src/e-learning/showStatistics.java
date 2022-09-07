/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmathisi1;

/**
 *
 * @author User
 */
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList; // import the ArrayList class
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class showStatistics {
    public static ArrayList<String> read()  {  
        ArrayList<String> fdata=new ArrayList<>();
        try  
        {  
            File file=new File("statistics.txt");       //creates a new file instance  
            FileReader fr=new FileReader(file);        //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String line;  
            while((line=br.readLine())!=null)  
            {  
                fdata.add(line);
                System.out.println(line);
            }  
            fr.close();                                //closes the stream and release the resources  
            }  
        catch(IOException e)  
        {  
            e.printStackTrace();  
        }
        finally {
            return fdata;
        }
    }  
    public static void Open(ArrayList<String> fdata) {
        JFrame frame;
        String [] columnNames={"Test Results"};
    
        frame=new JFrame("Data");
       
        String [][] data=new String [fdata.size()][1];
        int i=0;
        for(String s : fdata) {
            data[i][0]=s;
            i++;
        }
        JTable table=new JTable(data,columnNames);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(new JScrollPane(table));
    
    }
}
