import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	

		
	
	String age = JOptionPane.showInputDialog("How old are u?");
	int yourmom=Integer.parseInt(age);
	
	if (yourmom<18) {
		JOptionPane.showMessageDialog(null, "YOUR LIFE DOES NOT MATTER!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	if (yourmom>18) {
		JOptionPane.showInputDialog("YIPPY you can VOTE!!!!!!!!!!!!!!!!!");
		JOptionPane.showInputDialog("Would you pick cat's or dogs");
		JOptionPane.showInputDialog("what is your name");
	}
	

}
}