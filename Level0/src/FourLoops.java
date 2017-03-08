import javax.swing.JOptionPane;

import com.spun.util.database.SQLQuery.FromPart;

public class FourLoops {

	public static void main(String[] args) {

		for (int a = 0; a > -100; a++) {
			System.out.print(a + " ");
		}

		for (int i = 100; i > -1; i--) {
			System.out.print(i + " ");
		}

		for (int n = 2; n < 102; n += 2) {
			System.out.print(n + " ");
		}

		for (int t = 1; t < 101; t += 2) {
			System.out.print(t + " ");
		}

		for (int w = 0; w < 501; w++) {

			if (w % 2 == 1) {
				System.out.print(w + " odd ");
			} else if (w % 2 == 0) {
				System.out.print(w + " even ");
			}
		}

		for (int e = 0; e < 111; e++) {

			if (e % 7 == 7) {
				System.out.println(e);
			}
			
		}
	}

}
