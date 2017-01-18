import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class DaQuestions {
	public static void main(String[] args) {

		String Question1 = JOptionPane.showInputDialog("Do u like pizza!");

		if (Question1.equalsIgnoreCase("yes")) {
			
			String question2 =JOptionPane.showInputDialog("do u like pepperioni");
			if (question2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "enjoy your AMAZING chesse pizza!");
			}
			if (question2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "enjoy your pepperioni pizza");
			}
		}
		else if (Question1.equalsIgnoreCase("no")) {
		String question3=	JOptionPane.showInputDialog("do u like salad");
			
			if (question3.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "then have a salad");
			}
			if (question3.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "you must be hungry");
			}
		}
	}
}
