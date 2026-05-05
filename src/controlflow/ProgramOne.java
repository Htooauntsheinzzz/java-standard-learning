package controlflow;

import javax.swing.JOptionPane;

public class ProgramOne {

	public static void main(String[] args) {
	
		double mark  = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Exam Mark."));
		
		
		if (mark >= 50) {
			JOptionPane.showMessageDialog(null, "You passed the exam.");
		}else {
			JOptionPane.showMessageDialog(null, "You Failed The exam");
		}

	}

}
