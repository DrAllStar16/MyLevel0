


	
	
	
	
	 // Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	public class BirthdayReminder {

		public static void main(String[] args) {
		
			// 1. correct the birthdays for your family below
			String momsBirthday = "Febuary 13";
			String dadsBirthday = "March 29";
			String sisterBirthday = "Noveber 18";
			String alexBirthday = "Febuary 22";
			// 2. Find out which birthday the user wants and and store their response in a variable
		   String mememe= JOptionPane.showInputDialog("Do you want dads moms sister or alex birthday");
			// 3. Print out what the user typed
			JOptionPane.showMessageDialog(null, mememe+" birthday is");
			// 4. if user asked for "mom"
	    if (mememe.equals("moms")) {
		JOptionPane.showMessageDialog(null, momsBirthday+"");		//print mom's birthday  
		}	// 5. if user asked for "dad"
	    else	if (mememe.equals("dads")) {
		JOptionPane.showMessageDialog(null, dadsBirthday+"");		// print dad's birthday
		}// 6. if user asked for your name  print myBirthday
	    else	if (mememe.equals("sister")) {
			
		JOptionPane.showMessageDialog(null, sisterBirthday+"");
		}//7. otherwise print "Sorry, i don't remember that person's birthday!"

	    else	if (mememe.equals("alex")) {
			
		JOptionPane.showMessageDialog(null, alexBirthday+"");
		}
	    else {
			JOptionPane.showMessageDialog(null, "Who Are You Go AWAY");
		}
		} 
	
}

