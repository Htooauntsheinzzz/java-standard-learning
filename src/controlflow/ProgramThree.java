package controlflow;

import javax.swing.JOptionPane;

public class ProgramThree {

	public static void main(String[] args) {
		
		
		String [] names = new String [5];
		
		
		
		// input looping 
		
		for (int i = 1 ; i < 6  ; i ++ ) {
			
			names [i] = JOptionPane.showInputDialog("Enter Your Names");
		}
		
		
		// Display Looping from Array
		for (int i = 0 ; i < names.length ; i ++) {
				
			System.out.println(names[i]);
			
		}

	}

}
