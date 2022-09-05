import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements MouseListener, ActionListener{
	
	private JLabel label,l1, l2, l3, l4, l5, l6, l7, l8;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenuItem clearItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;
    private JMenuItem aboutItem;
   	
	public MyFrame(){
						
		this.setTitle("Movie Registration");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setSize(780,780);
		this.setLocationRelativeTo(null);
		setLayout(null);
		ImageIcon image = new ImageIcon("movie.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0XADD8E6));
				
		menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        
        clearItem = new JMenuItem("Clear Form");
        saveItem = new JMenuItem("Save to file");
        exitItem = new JMenuItem("Exit");
        aboutItem = new JMenuItem("About");
		
		label = new JLabel("Add a new Movie");
		label.setForeground(new Color(0x00000));
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setBounds(255, 25, 400, 30);
		
		l1 = new JLabel("Title");
		l1.setBounds(150, 80 ,200, 30);
		l1.setFont(new Font("Serif", Font.BOLD, 17));
		
		l2 = new JLabel("Date");
		l2.setBounds(150, 120 ,200, 30);
		l2.setFont(new Font("Serif", Font.BOLD, 17));
		
		l3 = new JLabel("Duration");
		l3.setBounds(150, 160 ,200, 30);
		l3.setFont(new Font("Serif", Font.BOLD, 17));
		
		l4 = new JLabel("Category");
		l4.setBounds(150, 200 ,200, 30);
		l4.setFont(new Font("Serif", Font.BOLD, 17));
		
		l5 = new JLabel("PG Rating");
		l5.setBounds(150, 240 ,200, 30);
		l5.setFont(new Font("Serif", Font.BOLD, 17));
		
		l6 = new JLabel("Lead Casting");
		l6.setBounds(150, 280 ,200, 30);
		l6.setFont(new Font("Serif", Font.BOLD, 17));
		
		l7 = new JLabel("Writers");
		l7.setBounds(150, 320 ,200, 30);
		l7.setFont(new Font("Serif", Font.BOLD, 17));
		
		l8 = new JLabel("Director");
		l8.setBounds(150, 360 ,200, 30);
		l8.setFont(new Font("Serif", Font.BOLD, 17));
		
		tf1 = new JTextField();
		tf1.setBounds(350, 80, 200, 30);
		
		tf2 = new JTextField();
		tf2.setBounds(350, 120, 200, 30);
		
		tf3 = new JTextField();
		tf3.setBounds(350, 160, 200, 30);
		
		tf4 = new JTextField();
		tf4.setBounds(350, 200, 200, 30);
		
		tf5 = new JTextField();
		tf5.setBounds(350, 240, 200, 30);
		
		tf6 = new JTextField();
		tf6.setBounds(350, 280, 200, 30);
		
		tf7 = new JTextField();
		tf7.setBounds(350, 320, 200, 30);
		
		tf8 = new JTextField();
		tf8.setBounds(350, 360, 200, 30);
				
		//create menu
        fileMenu.add(saveItem);
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
				
		btn1 = new JButton("Save");  
        btn2 = new JButton("Clear");
        btn3 = new JButton("About");  
        btn4 = new JButton("Statistics");
        btn5 = new JButton("Close");
        
        btn1.setBounds(60, 420, 100, 30);  
        btn2.setBounds(180, 420, 100, 30); 
        btn3.setBounds(300, 420, 100, 30);  
        btn4.setBounds(420, 420, 100, 30); 
        btn5.setBounds(540, 420, 100, 30); 
        
        add(label);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);
        add(tf6);
        add(tf7);
        add(tf8);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
						
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
		btn4.addMouseListener(this);
		btn5.addMouseListener(this);
		
		clearItem.addActionListener(this);
		exitItem.addActionListener(this);
		saveItem.addActionListener(this);
        fileMenu.addActionListener(this);
        aboutItem.addActionListener(this);
        
		
		this.setVisible(true);
				
	}
		

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
				
		if(e.getSource() == btn1) {
			saveToFile();
			clearFields();
		}	
		
		if(e.getSource() == btn2) {
			
			clearFields();
		
		}
		
		if(e.getSource() == btn3) {
			this.setVisible(false);
			new MyFrame1().setVisible(true);
		}
		
		if(e.getSource() == btn4) {
			this.setVisible(false);
			new MyFrame2().setVisible(true);
						
			}
		
		if(e.getSource() == btn5) {
			exitApp();
			
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == exitItem) {
			exitApp();
		}
		
		if(e.getSource()== saveItem) {
			saveToFile();
		}
				
		if(e.getSource()== aboutItem) {
			this.setVisible(false);
			new MyFrame1().setVisible(true);
		}
		
		if(e.getSource() == clearItem) {
			clearFields();		
			}
		
	}
	
	
	
	
private void exitApp() {
	int i = JOptionPane.showConfirmDialog(MyFrame.this, "Do you want to exit the app?");
    if (i == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
}

private void clearFields() {
	
	tf1.setText("");  
    tf2.setText("");  
    tf3.setText("");  
    tf4.setText("");  
    tf5.setText("");  
    tf6.setText("");  
    tf7.setText("");
    tf8.setText("");
}

private void saveToFile() {
	
   String data =tf1.getText()+"," +tf2.getText()+","+tf3.getText()+","+tf4.getText()+","+tf5.getText()+","+tf6.getText()+","+tf7.getText()+","+tf8.getText();
     
    if (data.contains(",,") ) {																	//toulaxiston kapou yparxei mia kenh eggrafh
        JOptionPane.showMessageDialog(
                MyFrame.this,
                "Nothing to save",
                "Save warning",
                JOptionPane.WARNING_MESSAGE);
       
    } else {
                    	
            File fileName = new File("Registred Movies.txt");

             try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))){
            
				writer.write(data);
				writer.newLine();
				writer.close();

                JOptionPane.showMessageDialog(
                        MyFrame.this,
                        "Data succesfully saved to " + fileName,
                        "Save completed",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(btn1,
                        "Can't access " + fileName,
                        "File access error",
                        JOptionPane.ERROR_MESSAGE);
            }
    }
    		
}


}



