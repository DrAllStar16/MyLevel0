import javax.swing.JOptionPane;

public class VotingGame {
	public static void main(String[] args) {
		// 2. Create and initialize variables to hold the score
		// for each of your buttons
		int Ferrari = 0;
		int Porsche = 0;
		int BMW = 0;
		// 4. Add a loop of 1000 to allow lots of votes!
		for (int i = 0; i < 1000; i++) {

			// 1. Use showOptionDialog to ask a question that you want
			// the students in your class to vote on.
			// Fill in the button text to make a multiple choice answer.
			// Keep the 'Get score' button as your last button.
			int answer = JOptionPane.showOptionDialog(null, "What is my #1 dream car", "Dream Cars", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Ferrari 458 Italia ", "Porsche 911 gt3 RS", "BMW i8", "Get score!" }, null);

			// 3. Increment the score variable for the button that was pressed.
			if (answer == 0) {
				Ferrari += 1;
			} else if (answer == 1) {
				Porsche += 1;
			} else if (answer == 2) {
				BMW += 1;
			}
			// 5. When the 'Get score' button is pressed, break out of the loop
			if (answer == 3) {
				break;
			}
			// 6. Once the voting is done, use a pop-up to show the results.
			// Format it to look nice.
		} // Reminder: \n inside your string will add a new line.

		JOptionPane.showMessageDialog(null,
				"Ferrari 458 Italia got " + Ferrari + "\n Porsche 911 gt3 RS got " + Porsche + "\n BMW i8 got " + BMW);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "My Dream Car is the Porsche 911 gt3 RS");

	}
}
