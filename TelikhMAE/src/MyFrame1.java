import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame1 extends JFrame implements MouseListener{
	
	JLabel label, l1, l2, l3, l4, l5, l6, l7,l8, img1;
	JButton btn1;
	
	MyFrame1(){
		
		this.setTitle("Movie Registration");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		this.setSize(700,700);
		setLayout(null);
		
		ImageIcon image = new ImageIcon("movie.png");
		
		ImageIcon image1 = new ImageIcon("movie1.png");
		
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0XADD8E6));
						
		l1 = new JLabel("Application : Film Registration");
		l1.setBounds(220, 60 ,300, 30);
		l1.setFont(new Font("Serif", Font.BOLD, 17));
		
		l2 = new JLabel("Developer : Kapsis Stylianos - Michail");
		l2.setBounds(220, 120 ,400, 30);
		l2.setFont(new Font("Serif", Font.BOLD, 17));
		
		l3 = new JLabel("Identification Number : 71347427");
		l3.setBounds(220, 180 ,400, 30);
		l3.setFont(new Font("Serif", Font.BOLD, 17));
		
		l4 = new JLabel("University : University of West Attica");
		l4.setBounds(220, 240 ,400, 30);
		l4.setFont(new Font("Serif", Font.BOLD, 17));
		
		l5 = new JLabel("Department : Informatics and Computer Science");
		l5.setBounds(220, 300 ,400, 30);
		l5.setFont(new Font("Serif", Font.BOLD, 17));
		
		l6 = new JLabel("Mail : cse47427@uniwa.gr");
		l6.setBounds(220, 360 ,400, 30);
		l6.setFont(new Font("Serif", Font.BOLD, 17));
		
		l7 = new JLabel("Working Dates : From 2/6/2022 To 9/6/2022");
		l7.setBounds(220, 420 ,400, 30);
		l7.setFont(new Font("Serif", Font.BOLD, 17));
		
		l8 = new JLabel("Application Logo : ");
		l8.setBounds(220,480 ,400, 100);
		l8.setFont(new Font("Serif", Font.BOLD, 17));
		l8.setIcon(image1);
		l8.setHorizontalTextPosition(SwingConstants.LEFT);
				
		btn1 = new JButton("Back");
		btn1.setBounds(280, 610, 100, 30);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
				
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

}

