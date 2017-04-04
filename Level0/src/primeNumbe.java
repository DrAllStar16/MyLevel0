import javax.swing.JOptionPane;

public class primeNumbe {
public static void main(String[] args) {
	String num =JOptionPane.showInputDialog("GIVE ME A NUMBER BETWEEN 2 AND 99");
	int Num2 =Integer.parseInt(num);
	for (int i = 2; i < Num2-1; i++) {
		
	
	
	

	if (Num2%i==0) {
		JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		break;
	}
	else {
		JOptionPane.showMessageDialog(null, "Your number is a prime number");
		
	}
}
}

}