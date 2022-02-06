import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class Mygui extends Frame implements ActionListener{
	
		 TextField nametxtfld, addresstxtfld, agetxtfld;
		 Label namelab, addresslab, agelab;
		 Button button;
	Mygui(){
		setLayout(new FlowLayout());
		setTitle("Helow GUI");
		
		//setSize(400,400);
		setVisible(true);
		
		namelab = new Label("Name:  ");
		nametxtfld = new TextField(20); 
		
		addresslab = new Label("Address:  ");
		addresstxtfld= new TextField(20);
		
		button = new Button("submit");
		add(namelab);
		add(nametxtfld);
		
		
		add(addresslab);
		add(addresstxtfld);
		
		add(button);
		button.addActionListener(this);
		
		setBounds(200,500,300,500);
		
		
		
		
	}
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Name: "+nametxtfld.getText());
			System.out.println("Address: "+addresstxtfld.getText());
			
		}
		
	
	public static void main(String[] args) {
	
		new Mygui();
	}
	
		
	}

