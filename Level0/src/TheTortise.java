import org.teachingextensions.logo.Tortoise;

public class TheTortise {
	public static void main(String[] args) {

		// name is turdise

		Tortoise.show();
		Tortoise.penDown();

		drawSquare();

		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(150);
		Tortoise.penDown();
		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(120);
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {

			Tortoise.penDown();
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}
}
