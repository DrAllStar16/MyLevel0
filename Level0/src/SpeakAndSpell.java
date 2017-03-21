import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak & Spell was introduced at the summer
 * Consumer Electronics Show in June 1978, making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you would make this program. Allow them to
 * code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		String mandlebrot = JOptionPane.showInputDialog("");
		// 2. Catch the user's answer in a String
		// done
		// 3. If the user spelled the word correctly, speak "correct"
		if (mandlebrot.equals("mandlebrot")) {
			speak("Correct");

		}
		// 4. Otherwise say "wrong"
		else {
			speak("WRONG, Go die in a hole");
		}

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell DingleBells");
		String DingleBells = JOptionPane.showInputDialog("");
		// 2. Catch the user's answer in a String
		// done
		// 3. If the user spelled the word correctly, speak "correct"
		if (DingleBells.equals("DingleBells")) {
			speak("Correct");

		}
		// 4. Otherwise say "wrong"
		else {
			speak("WRONG, Go die in a hole");
		}

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell Lama Doma Ding Dong");
		String LDDD = JOptionPane.showInputDialog("");
		// 2. Catch the user's answer in a String
		// done
		// 3. If the user spelled the word correctly, speak "correct"
		if (LDDD.equals("LAMA DOMA DING DONG")) {
			speak("Correct");

		}
		// 4. Otherwise say "wrong"
		else {
			speak("WRONG, Go die in a hole");
		}
		// 5. repeat the process for other words

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell We We LE LE");
		String WWLL = JOptionPane.showInputDialog("");
		// 2. Catch the user's answer in a String
		// done
		// 3. If the user spelled the word correctly, speak "correct"
		if (WWLL.equals("we we le le")) {
			speak("Correct");

		}
		// 4. Otherwise say "wrong"
		else {
			speak("WRONG, Go die in a hole");
		}
		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
