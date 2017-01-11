import java.util.Random;

import javax.swing.JOptionPane;

public class LOTTERY {

	public static void main(String[] args) {
		String thing="the number's that will make you money are... ";
		for (int i = 0; i < 5; i++) {
			int ran = new Random().nextInt(50);
			thing+=ran+" ";
		}
		
			JOptionPane.showMessageDialog(null,thing) ;

		
	}
}
