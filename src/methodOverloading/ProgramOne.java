package methodOverloading;

import javax.swing.JOptionPane;

public class ProgramOne {
	
	public static void main(String[] args) {
		
		
		Person person = new Person();
		
		
		String name = JOptionPane.showInputDialog("What is your name?");
				
		int age 	= Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		
		
		String work = JOptionPane.showInputDialog(name + " What is your work?");
		
		String father = JOptionPane.showInputDialog("Who is your father?");
		
		String mother = JOptionPane.showInputDialog("Who is your mother?");
		
		String[] options = {"Single" ,"Married"};
		
		
		int statusChoice = JOptionPane.showOptionDialog(null, 
							"What is your status?","Status",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,
							null, options,options[1]);
		
		
		person.age = age;
		
		person.details(name, work);
		
		
		person.family(father, mother);
		
		boolean isSingle = statusChoice == 0;
		
		String statusResult = person.status(isSingle);
		
		System.out.println(statusResult);
		
		
		
	}

}
