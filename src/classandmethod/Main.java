package classandmethod;

import javax.swing.JOptionPane;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		
		// Object square obj -> main.java 
		Square s = new Square();
		
		String name = JOptionPane.showInputDialog("What is your name ?");
		
		String result = s.callName(name);
		
		System.out.println(result);
		
		
		
	}

}
