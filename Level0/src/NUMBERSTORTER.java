import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class NUMBERSTORTER {
	public static void main(String[] args) {

		 for (int i = 0; i < 10000; i++) {

		String Num1 = JOptionPane.showInputDialog("Pick A Number");
		String Num2 = JOptionPane.showInputDialog("Pick A Second Number");
		String Num3 = JOptionPane.showInputDialog("Pick A  Third Number");

		int Num1Int = Integer.parseInt(Num1);
		int Num2Int = Integer.parseInt(Num2);
		int Num3Int = Integer.parseInt(Num3);

		if ((Num1Int < Num2Int) && (Num1Int < Num3Int)) {
			System.out.println(Num1Int);
			
			if  (Num2Int <Num3Int) {
			System.out.println(Num2Int);
			System.out.println(Num3Int);
			}
			else {
				System.out.println(Num3Int);
				System.out.println(Num2Int);
			}
		}

		if ((Num2Int < Num1Int) && (Num2Int < Num3Int)) {
			System.out.println(Num2Int);
			
			if (Num1Int < Num3Int) {
				System.out.println(Num1Int);
				System.out.println(Num3Int);
			}
				else {
					System.out.println(Num3Int);
					System.out.println(Num1Int);
				}
			
		}
		if ((Num3Int < Num1Int) && (Num3Int < Num2Int)) {
			System.out.println(Num3Int );
			
			if (Num1Int< Num2Int) {
				System.out.println(Num1Int);
				System.out.println(Num2Int);
			}
			else {
				System.out.println(Num2Int);
				System.out.println(Num1Int);
			}
		}

	}
}
 }