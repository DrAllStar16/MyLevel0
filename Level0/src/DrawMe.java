import org.jointheleague.graphical.robot.Robot;

public class DrawMe {
public static void main(String[] args) {
	
	Robot Alex= new Robot();
	Alex.setSpeed(10);
	Alex.penDown();
	Alex.turn(20);
	Alex.move(500);
	Alex.turn(135);
	Alex.move(500);
	Alex.turn(180);
	Alex.move(350);
	Alex.turn(300);
	Alex.move(110);
	Alex.penUp();
	Alex.move(500);
	Alex.penDown();
	Alex.turn(144);
	Alex.move(100);
	Alex.turn(144);
	Alex.move(100);
	Alex.turn(144);
	Alex.move(100);
	Alex.turn(144);
	Alex.move(100);
	Alex.turn(144);
	Alex.move(100);
	Alex.penUp();
	Alex.move(200);
	Alex.penDown();
	for (int i = 0; i <5; i++) {
		
	Alex.move(100);
	Alex.turn(144);
	}
	Alex.penUp();
	Alex.move(200);
	
	
	
	
	
	
}
}
