import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements MouseListener{
	
	JLabel l1, l2, l3, l4, l5, l6;
	JButton btn1;
		
	MyFrame2() {
		
		ArrayList<String> data = new ArrayList<>();
		data.addAll(loadFromFile());
		
		this.setTitle("Movie Registration");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setSize(700,700);
		setLayout(null);
		
		ImageIcon image = new ImageIcon("movie.png");
				
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0XADD8E6));
		
		l1 = new JLabel("Number of registered Movies :" + data.get(0));
		l1.setBounds(230, 80 ,300, 30);
		l1.setFont(new Font("Serif", Font.BOLD, 17));
		
		l2 = new JLabel("Average duration (in minutes) :" + data.get(1));
		l2.setBounds(230, 140 ,300, 30);
		l2.setFont(new Font("Serif", Font.BOLD, 17));
		
		l3 = new JLabel("Most Popular Category :" + data.get(2));
		l3.setBounds(230, 200 ,500, 30);
		l3.setFont(new Font("Serif", Font.BOLD, 17));
		
		l4 = new JLabel("Oldest Movie :" + data.get(3));
		l4.setBounds(230, 260 ,300, 30);
		l4.setFont(new Font("Serif", Font.BOLD, 17));
		
		l5 = new JLabel("Newest Movie :" + data.get(4));
		l5.setBounds(230, 320 ,300, 30);
		l5.setFont(new Font("Serif", Font.BOLD, 17));
				
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		
		
		btn1 = new JButton("Back");
		btn1.setBounds(280, 420, 100, 30);
		
		add(btn1);
		
		btn1.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1) {
			this.setVisible(false);
			new MyFrame();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<String> loadFromFile() {
		
		String fileName = "C:\\Users\\PSISKA\\eclipse-workspace\\TelikhMAE\\Registred Movies.txt";
		ArrayList<String> data = new ArrayList<>();
		ArrayList<String> data2 = new ArrayList<>();
		ArrayList<String> data3 = new ArrayList<>();
		ArrayList <Integer> data4 = new ArrayList<>(); 
		
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
                     
            String line = "";
            
            int numM=0;
            float avgD=0;
            String mostFamousCat="";
            String amountM = "";
            int oldM=3000;
            int newM=0;
            String OM ="";
            String NM ="";
            
            while (reader.ready()) {
                line = reader.readLine();
                               
                if (!line.contains(",,")) {		         
                	String[] table = line.split(",");
                	avgD+=Float.parseFloat(table[2]);
                	data2.add(table[3]);
                	
                	if(oldM>Integer.parseInt(table[1])) {
                		oldM = Integer.parseInt(table[1]);
                		OM = table[0];        				
                	}
                	
                	if(newM<Integer.parseInt(table[1])) {
                		newM = Integer.parseInt(table[1]);
                		NM=table[0];
                	}
                	numM++;
                  }
                
            	}
            Collections.sort(data2); 
            
            data2.add("");
            int counter = 1;
           
            for(int i =0; i < data2.size()-1 ;i++) {
            	
            	if(!data2.get(i).equals(data2.get(i+1))) {
            		data3.add(String.valueOf(counter) + "," + data2.get(i));
            		counter = 1 ;
            		
            	} else {
            		counter++;
            	}
            }
            
            for(String s : data3) {
            	String[] table1 = s.split(",");
            	data4.add(Integer.parseInt(table1[0]));
            }
            
            Collections.sort(data4);
                        
            for(String s : data3) {
            	if(String.valueOf(data4.get(data4.size()-1)).equals(s.split(",")[0])) {      
            		mostFamousCat = s.split(",")[1];
            		amountM = s.split(",")[0];
            	}
            }
            data.add(String.valueOf(numM));
            data.add(String.valueOf(avgD/numM));
            data.add(mostFamousCat + " " +amountM + " Registrations");
            data.add(OM);
            data.add(NM);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(btn1,
                        "Can't access " + fileName,
                        "File not found error",
                        JOptionPane.ERROR_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(btn1,
                        "Can't write to " + fileName,
                        "File I/O error",
                        JOptionPane.ERROR_MESSAGE);

        	}
		return data;
    	
	}
}
	
