package controlflow;

import java.util.Scanner;

public class ProgramEight {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String [][] student = new String [2][4];
		

		
		System.out.println("Enter Student Age");
		int age = Integer.parseInt(sc.nextLine());
		
		if (age >= 18 ) {
			
			int row = 0;
			
			while (row < student.length) {
				
				int col = 0; 
				
				System.out.println("\nEnter Data For Student "+ (row + 1));
				
				while (col < student[row].length) {
					
					if (col == 0) {
						System.out.println("Enter Your Name");
						student[row][col] = sc.nextLine();
						
						
					}
					
					if (col == 1) {
						System.out.println("Enter Subject 1 Mark");
						student[row][col] = sc.nextLine();
			
						
					}
					
					if (col == 2 ) {
						System.out.println("Enter Subject 2 Mark");
						student[row][col] = sc.nextLine();
					
					}
					
					if (col == 3) {
						
						System.out.println("Enter Subject 3 Mark");
						student[row][col] = sc.nextLine();
			
					}
					
					col++;
				}
				
				row++;
				
				
			}
			
			System.out.println("\n ----- Student List Result-----");
			
			row = 0;
			
			while ( row < student.length) {
				
				
				double total  = 0;
				
				total += Double.parseDouble(student[row][1]);
				total += Double.parseDouble(student[row][2]);
				total += Double.parseDouble(student[row][3]);
				
				
				
				System.out.println("\nStudent"+ (row+1));
				System.out.println("Name: "+student[row][0]);
				System.out.println("Subject One: "+student[row][1]);
				System.out.println("Subject Two: "+student[row][2]);
				System.out.println("Subject Three: "+student[row][3]);
				System.out.println("Total Mark: "+total);
				
				
				if (total >=120) {
					
					System.out.println("Result: Pass");
				}else {
					System.out.println("Result: Fail");
				}
				
				row++;
				
				
			}
			
			
		}else {
			
			System.out.println("Age must be 18 or above");
		}
		
		sc.close();
		
	}

}
