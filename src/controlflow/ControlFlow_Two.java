package controlflow;

import javax.swing.JOptionPane;

public class ControlFlow_Two {

	public static void main(String[] args) {
	
		
		String input = JOptionPane.showInputDialog("Enter Withdraw - 1 & Deposit 2");
		
		int checkingAction = Integer.parseInt(input);
		
		
		switch (checkingAction) {
		case 1:
			JOptionPane.showMessageDialog(null, "You can now withdraw !!");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "You can now deposit !!");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input Value");
			break;
		}

	}

}
