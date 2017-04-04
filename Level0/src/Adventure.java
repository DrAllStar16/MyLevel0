import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {

		String Num1 = JOptionPane.showInputDialog("you could get a >tablet< or a >phone<");
		// -------------------------------------------------------------------------------------------------------------------------------------
		if (Num1.equals("tablet")) {
			Num1 = JOptionPane.showInputDialog(">Apple1< or >Andrio1d<");
		}

		if (Num1.equals("phone")) {
			Num1 = JOptionPane.showInputDialog(">Apple2< or >Andriod2<");
		}

		// ______________________________________________________________________________________________________________________________________

		if (Num1.equals("Apple1")) {
			Num1 = JOptionPane.showInputDialog("Whould you get the >SE< or the >6<");
		}

		if (Num1.equals("Andriod1")) {
			Num1 = JOptionPane.showInputDialog("Would you get the >S5< or >Moto Mod Driod<");
		}

		if (Num1.equals("Apple2")) {
			Num1 = JOptionPane.showInputDialog("Would you get the >I pad< or the >I pad Mini<");
		}

		if (Num1.equals("Andriod2")) {
			Num1 = JOptionPane.showInputDialog("Woudl you get the >Galaxy Tab< or the >Galaxy tab A<");
		}

		// ==================================================================================================================================

		if (Num1.equals("SE")) {
			Num1 = JOptionPane.showInputDialog("Nice Choice");

			if (Num1.equals("6")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}

			if (Num1.equals("S5")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}

			if (Num1.equals("Moto Mod Driod")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}

			if (Num1.equals("I pad")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}

			if (Num1.equals("I pad Mini")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}

			if (Num1.equals("Galaxy Tab")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}

			if (Num1.equals("Galaxy Tab A")) {
				Num1 = JOptionPane.showInputDialog("Nice Choice");
			}
		}
	}
}
