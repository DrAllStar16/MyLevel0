import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		goofyName = JOptionPane.showInputDialog("What is your name");
		String goofynamextra = " ";
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.
		System.out.println(goofyName.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the
		// String.
		for (int bob = 0; bob < goofyName.length(); bob++) {

			// 4. Create a String variable to store the next character of the
			// name
			// using .substring(start, end)
			// HINT: replace 'start' and 'end' to get String with character at i
String Goofyname2=goofyName.substring(bob,bob+1);
System.out.println(Goofyname2);
			// 5. Use MODULO to set this variable to upper case for EVEN
			// characters
			// and lower case for ODD characters.
if (bob%2==0) {
 Goofyname2=Goofyname2.toUpperCase();
}
else {
	Goofyname2=Goofyname2.toLowerCase();
}
goofynamextra+=Goofyname2;
			// 6. ADD this String (containing 1 char) to the goofyName String

			// 7. Use pop-up to show user their Goofy name


		}
		JOptionPane.showMessageDialog(null, goofynamextra);
	}
}
