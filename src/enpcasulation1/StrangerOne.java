package enpcasulation1;

public class StrangerOne {
	
	public static void main(String[] args) {
		
		// Composition // Same Package
		Dad dad = new Dad();
		//dad.wallet  cannot because it is private variable
		dad.phone ="Samsung S25";
		dad.watch ="Casio";
		dad.cloth ="Zara";
		
		dad.getPhone();
		dad.getWatch();
		dad.getCloth();
	}

}
