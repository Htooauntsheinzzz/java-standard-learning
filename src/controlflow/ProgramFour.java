package controlflow;

import javax.swing.JOptionPane;

public class ProgramFour {

	public static void main(String[] args) {
			
		String [] student = new String [5];
		
		// input 
		for (int i = 0 ; i < 5 ; i ++) {
			
			student[i] = JOptionPane.showInputDialog("Enter Student Names");
			
		}
		
		// searching with if loop and for loop 
		for (int i  = 0 ; i < student.length ; i ++ ) {
			
			if (student[i].contains("Phyo")) {
				
				JOptionPane.showMessageDialog(null, "Found Phyo at index " + i);
				
			}else {
				System.out.println(student[i]);
			}
		}

	}

}
