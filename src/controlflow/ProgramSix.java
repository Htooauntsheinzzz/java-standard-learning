package controlflow;

import java.util.Scanner;

public class ProgramSix {

	public static void main(String[] args) {
		
		
		String [][] group = new String [5][2];
		
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while (i < group.length) {
			
			System.out.print("Enter name for student "+ (i + 1) + ": ");
			group[i] [0] = sc.nextLine();
			
			System.out.print("Enter Mark for student "+ (i + 1) + ": ");
			group[i][1] =sc.nextLine();
			
			i++;
		}
		
		
		System.out.println("\n---- Student List ----");
		
		
		int j = 0;
		
		while ( j < group.length) {
			
			
			System.out.println(group[j][0] + " - " + group[j][1]);
			
			j++;
		}
		sc.close();
		

	}

}
