import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Smallprog implements ActionListener{
	JFrame f = new JFrame("ADD");
	JTextField f1 = new JTextField(20);
	JTextField f2 = new JTextField(20);
	JButton b1= new JButton("add");
	JButton b2= new JButton("subs");
	JButton b3= new JButton("multi");
	JButton b4= new JButton("Mod");
	
	
	JLabel l =new JLabel("result");
	
	
	Smallprog(){
		f.setLayout(new FlowLayout());
		f.setSize(270,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		
		
		//b1.setBounds(40,40,90,90);
		f.add(f1);
		f.add(f2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(l);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b1)) {
		int num1=Integer.parseInt(f1.getText());
		int num2=Integer.parseInt(f2.getText());
		
		int sum = num2+num1;
		l.setText(sum + " ");
		}
		if(e.getSource().equals(b2)) {
			int num1=Integer.parseInt(f1.getText());
			int num2=Integer.parseInt(f2.getText());
			
			int sub = num2-num1;
			l.setText(sub + " ");
		}
		if(e.getSource().equals(b3)) {
			int num1=Integer.parseInt(f1.getText());
			int num2=Integer.parseInt(f2.getText());
			
			int mult = num2*num1;
			l.setText(mult + " ");
		}
		if(e.getSource().equals(b4)) {
			int num1=Integer.parseInt(f1.getText());
			int num2=Integer.parseInt(f2.getText());
			
			int mod = num2%num1;
			l.setText(mod + " ");
		}
		
	}
	
	
	public static void main(String[] args) {
		new Smallprog();
	}
	
}
