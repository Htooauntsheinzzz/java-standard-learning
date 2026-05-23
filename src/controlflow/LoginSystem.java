package controlflow;

import javax.swing.JOptionPane;

public class LoginSystem {

	public static void main(String[] args) {
		
		
		String[][] users = {
				
				{		//0				1
					"admin@rsu.ac.th","admin123"//0
				},
				{		// 0					1
					"phyokhantkyaw@rsu.ac.th","phyo123"//1
				}, 
				{ //   0 				1
					"shein@rsu.ac.th" ,"shein123"//2
				}
		};
		
		
		boolean loginSuccess = false; // starting point 
		
		do {
			
			JOptionPane.showMessageDialog(null,"Please Login Here");
			
			String username = JOptionPane.showInputDialog("Enter Username:");
			
			String password = JOptionPane.showInputDialog("Enter Password: ");
			
			
			int row = 0;
			
			while (row < users.length) {
				
				
				if (username.equals(users[row][0]) 
						
					&& password.equals(users[row][1])) {
					
					
					loginSuccess = true;
					
					break; // jump statement   
				}
				
				row++;
			}
			
			if (loginSuccess) {
				JOptionPane.showMessageDialog(null, "Login Successful");
			}else {
				JOptionPane.showMessageDialog(null, "Username & Password is wrong. Try Again");
			}
				
		}while(!loginSuccess);// when true it will stop. 
	

	}

}
