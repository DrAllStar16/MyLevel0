import java.net.URI;

import javax.swing.JOptionPane;


public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String catpoop =JOptionPane.showInputDialog("How many cats do you have in you life");

		// 2. Convert their answer into an int

int catpoo=Integer.parseInt(catpoop);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (catpoo>3) {
	JOptionPane.showMessageDialog(null, "Your a crazy cat lady");
	
}

		// 4. If they have 3 or less, call the method below to show them a cat video
if (catpoo<3) {
	

playVideo("https://youtu.be/kKhvCFeF990");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		if (catpoo<1) {
			playVideo("https://youtu.be/SKRgktzRvZ0");
		}
	}


	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}


