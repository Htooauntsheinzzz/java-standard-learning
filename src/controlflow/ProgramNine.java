package controlflow;

import javax.swing.JOptionPane;

public class ProgramNine {

	public static void main(String[] args) {
			
		
		
		int studentCount;
		
		
		
		do {
			
			studentCount = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Students."));
			
			if  (studentCount <= 0 ) {
				JOptionPane.showMessageDialog(null,"Student Count must be greater than 0.");
			}
			
			
		}while (studentCount <= 0);
		
		
		double[] marks = new double[studentCount];
		
		
		int i = 0;
		
		while ( i < marks.length) {
			
			marks[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter mark for student "+ (i + 1 )));
			
			
			i++;
		}
		
		
		double total = 0;
		
		for (double mark : marks) {
			System.out.println("Mark Calculation Result");
			total += mark;
		}
		
		double average = total / marks.length;
		
		
		if (average >= 90) {
			
			JOptionPane.showMessageDialog(null,"Total Marks: " +  total + "\n Average Marks: "+ average);
			JOptionPane.showMessageDialog(null, "This Year School Result is Passed");
			
			
			
			JOptionPane.showMessageDialog(null,"Total Marks: " +  total + "\n Average Marks: "+ average);
			JOptionPane.showMessageDialog(null, "This Year School Result is Failed");
		}
		
		
	}

}
