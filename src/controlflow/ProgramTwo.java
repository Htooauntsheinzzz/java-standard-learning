package controlflow;

import javax.swing.JOptionPane;

public class ProgramTwo {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to Car Price Checking Areas.");
		
		String carName = JOptionPane.showInputDialog("Enter Your Car name");
		String carNo = JOptionPane.showInputDialog("Enter Your Car No");
		
		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));
		
		
		if (price <= 50000) {
			
			JOptionPane.showMessageDialog(null, "Your "+carName + carNo +"  value is Too Low Price");
			
		}else if (price >=50000 && price <=80000) {
			
			JOptionPane.showMessageDialog(null, "Your "+carName + carNo +"  value is Medium Price.");
			
		}else if (price >=80000 && price <= 200000) {
			
			JOptionPane.showMessageDialog(null, "Your "+carName + carNo +"  value is Great  Price.");
			
		}else {
			JOptionPane.showMessageDialog(null, "Your "+carName + carNo +"  value is Excellent  Price.");
		}
		
		
	}

}
