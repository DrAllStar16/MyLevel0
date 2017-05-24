import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;

/* Level 0 Exam: Coding  Exercise #1 */
public class Level0Exam1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw
		String colors = JOptionPane.showInputDialog("What color would you like your pen to be BLUE, RED, or GREEN");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		Robot bob = new Robot();
		if (colors.equals("BLUE")) {
			bob.setPenColor(0, 0, 200);
		} else if (colors.equals("RED")) {
			bob.setPenColor(Colors.Reds.Red);
		} else if (colors.equals("GREEN")) {
			bob.setPenColor(Colors.Greens.Green);
		}
		// 2. set the pen width to 10

		// 1. make the Robot draw a shape

		bob.setSpeed(10);
		bob.penDown();
		bob.setPenWidth(10);

		for (int i = 0; i < 4; i++) {
			bob.move(200);
			bob.turn(90);
		}

	}

}