import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	
	String Num1=JOptionPane.showInputDialog("You wake up on a Sunday at 7:45 do you want >to get up< or >stay in bed<");
	
	if (Num1.equals("stay in bed") ) {
		String Num21= JOptionPane.showInputDialog("You went back to sleep and it is now 8:30 do you want to >stay in bed< or >get up<");
	}
	
	if (Num1.equals("get up") ) {
		String Num22= JOptionPane.showInputDialog("You are now up do you want to go to >Dennys< or >Dount Touch<'");
	}
	
}
}
