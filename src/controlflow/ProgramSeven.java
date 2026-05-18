package controlflow;

import javax.swing.JOptionPane;

public class ProgramSeven {
	
	public static void main(String[] args) {
		
		
		String cars [][] = new String [4][3];
		
		
		/*  cars
		 *   row 1 - > col1 , col2, col3
		 *   row 2  - > col1 , col2, col3
		 *       3
		 * 		4 	
		 */
		
		int row = 0;
		
		double totalPrice = 0; // 45000 + 45000  -> 90000 + 45000 ->  135000  + 45000 -> 180000
		
		while  (row < cars.length) {
			
			int col = 0; 
			
			while (col < cars[row].length) {
				

				
				if (col == 0) {
					
					cars[row][col] = JOptionPane.showInputDialog("Enter Car "+( row + 1 )+ " Name" );
					
					
				}
				
				if (col == 1 ) {
					
					cars[row][col] = JOptionPane.showInputDialog("Enter Car "+ ( row +1 ) + " Model");
					
				}
				
				if (col == 2 ) {
					cars[row][col] = JOptionPane.showInputDialog("Enter Car "+ ( row+ 1 ) +" Price");
					
					totalPrice = totalPrice + Double.parseDouble(cars[row][col]);
					
				}
				
				
				col++;
			}
		
			row++;
		
		}
		
		System.out.println("\n---- Car Data ----");
		
		row = 0;
		
		while (row < cars.length) {
			
			int col = 0;
			
			while (col < cars[row].length) {
				System.out.println(cars[row][col] + "\t");
				
				col++;
			}
			System.out.println();
			row++;
		
		}
		
		System.out.println(totalPrice);
		
	}

}
