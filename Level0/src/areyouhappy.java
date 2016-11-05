import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		
	
String Happy= JOptionPane.showInputDialog("Are You Happy");

if(Happy.equals("Yes")){
	JOptionPane.showMessageDialog(null, "Keep Doing What You Are Doing ");
}
if (Happy.equals("No")) {
	String NotHappy=JOptionPane.showInputDialog("Do You Want To Be happy");
	if (NotHappy.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Change Something");
		 
	}
	if (NotHappy.equals("No")) {
		JOptionPane.showMessageDialog(null, "Keep Doing What You Are Doing");

}


}
}
}

