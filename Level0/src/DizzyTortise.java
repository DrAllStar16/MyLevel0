import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class DizzyTortise {


	public static void main(String[] args) {
				
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
 String pooped=JOptionPane.showInputDialog("how dizzy should the tortiose get");
int poopey=Integer.parseInt(pooped);
 // 1. Use the dance method to make the Tortoise spin.
				dance(poopey);


	}


	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}


