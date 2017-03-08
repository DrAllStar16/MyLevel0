import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i = 0; i < 10000; i++) {
	

		// 1. Get 2 numbers from the user and convert them to integer.
		String Numbers = JOptionPane.showInputDialog("Pick A number");
		String Numbers2 = JOptionPane.showInputDialog("Pick A number");
		
		int NumberInt = Integer.parseInt(Numbers);
		int Number2Int = Integer.parseInt(Numbers2);
		// 2. Customize pop-up to support add/subtract/multiply/divide
		// operations.
		int operation = JOptionPane.showOptionDialog(null, "What would u like to do?", "Endless Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Addition", "Subraction", "Multiplication", "Division" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the
		// appropriate operation.
	if (operation==0) {
		Adding(NumberInt, Number2Int);
	}	

	if (operation==1) {
		Subracting(NumberInt, Number2Int);
	}
	
	if (operation==2) {
		Mutiply(NumberInt, Number2Int);
	}
	
	if (operation==3) {
	
	Dividing(NumberInt, Number2Int);
	}
}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator
		// operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25
	// = 70.
	// HINT: use 'static void add(int num1, num2) { ... }
static void Adding (int NumberInt, int Number2Int){
	
	
	JOptionPane.showMessageDialog(null,(NumberInt + Number2Int ) +" is your sum");	

}

	static void Subracting (int NumberInt, int Number2Int){
	
	
	JOptionPane.showMessageDialog(null,(NumberInt - Number2Int ) +" is your sum");	
	
	
}

static void Mutiply (int NumberInt, int Number2Int){
	
	
	
	JOptionPane.showMessageDialog(null,(NumberInt * Number2Int ) +" is your sum");	
	
}

static void Dividing (int NumberInt, int Number2Int){
	
	
	JOptionPane.showMessageDialog(null,(NumberInt / Number2Int ) +" is your sum");	
	
	
}
	// 4. Create similar methods for subtraction, multiplication and division.
}
