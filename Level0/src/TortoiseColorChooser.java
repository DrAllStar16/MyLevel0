
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		
		for(int A=1;A<10;A++){
		
		
		
		
		
		Tortoise.setSpeed(5);
		//3. ask the user what color they would like the tortoise to draw
		String input=JOptionPane.showInputDialog("Do You Want red cyan Or green");
		//4. use an if/else statement to set the pen color that the user requested
 if(input.equals("red")){
	 Tortoise.setPenColor(Color.RED);
 }
 else if(input.equals("cyan")){
	 Tortoise.setPenColor(Color.CYAN);
 }
 else if(input.equals("green")){
	 Tortoise.setPenColor(Color.GREEN);
 }
//5. if the user doesn’t enter anything, choose a random color
 else{
	 Tortoise.setPenColor(PenColors.getRandomColor());
 }
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
Tortoise.penDown();
for(int i=0;i< 4;i++){
	Tortoise.move(150);
	Tortoise.turn(90);
}

	}
}
}

