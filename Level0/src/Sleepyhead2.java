// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Sleepyhead2 {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
	

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */

int one = JOptionPane.showConfirmDialog(null, "is it a vaction??", "The Question", 
		JOptionPane.YES_NO_OPTION);

	if (one==0) {
		JOptionPane.showMessageDialog(null, "You may sleep in in");
	}
	
	if (one==1) {
		int two= JOptionPane.showConfirmDialog(null,"is it a weekend", "The Question",
				JOptionPane.YES_NO_OPTION);
		
		
		if (two==1) {
			JOptionPane.showMessageDialog(null, "Get up lazy bones AKA Jones AKA Mr.PoopyHead");
		} 
		
		if (two==0) {
			JOptionPane.showMessageDialog(null, "You have permission to sleep in");
		}
	}

	
	}
}

