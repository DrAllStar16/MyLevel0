import java.net.URI;


import javax.swing.JOptionPane;


public class MusicOfLife {


	public static void main(String[] args) {


		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "Press One", "Don't Press Don't Press", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { " Press Me = 0 ", " Don't Press = 1 ", " Press For Funny Stuff = 2 " }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
JOptionPane.showMessageDialog(null, " You Picked " + userMood);

		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

	
if (userMood==1) {
	playVideo("https://youtu.be/tsrCEFbajPI");
}
if (userMood==2) {
	playVideo("https://youtu.be/tsrCEFbajPI");
}
if (userMood==0) {
	playVideo("https://youtu.be/a5JySIRcPFs");
}
		// 4. Play different songs for other moods.


		// If you are seeing ads at the beginning of your videos, install Adblock.


	}


	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/


