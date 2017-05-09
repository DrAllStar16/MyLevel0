import javax.swing.JOptionPane;

public class StringMethod2 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String werid="DiNg dOnG";
		// 2. Print your String to the console in upper case.
	JOptionPane.showMessageDialog(null, werid.toUpperCase());  
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
JOptionPane.showMessageDialog(null, werid.substring(0,3));		
// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		JOptionPane.showMessageDialog(null, werid.charAt(6));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		


JOptionPane.showMessageDialog(null, werid.substring(werid.length()-3,werid.length()-0));
	}
}

