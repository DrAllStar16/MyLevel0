import org.teachingextensions.logo.Tortoise;

public class ObedienTurdis {
	public static void main(String[] args) {

		// name is turdise
		Tortoise.setSpeed(10);
		Tortoise.show();
		Tortoise.penDown();

		drawSquare();

		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(150);
		Tortoise.penDown();

		drawtriangle();

		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.penDown();

		drawcircle();
        draweverything(16);
	}
private static void draweverything(int numSides) {

	for (int i = 0; i <  numSides; i++) {

		Tortoise.penDown();
		Tortoise.move(50);
		Tortoise.turn(360/numSides);

	}
} 
	static void drawSquare() {
		for (int i = 0; i < 4; i++) {

			Tortoise.penDown();
			Tortoise.move(50);
			Tortoise.turn(360/4);

		}
	}

	private static void drawtriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(360/3);
		}

	}

	private static void drawcircle() {
		for (int i = 0; i < 360; i++) {

			Tortoise.move(1);
			Tortoise.turn(360 / 360);
		}
	}

}
