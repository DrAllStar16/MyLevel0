import javax.swing.JOptionPane;

public class Grades {
public static void main(String[] args) {
	
String score=JOptionPane.showInputDialog("What is your test score?");
	
int score2=Integer.parseInt(score);

if (score2>99) {
	JOptionPane.showMessageDialog(null, "A+");
}

else if (score2>92) {
	JOptionPane.showMessageDialog(null, "A");
}

else if (score2>89) {
	JOptionPane.showMessageDialog(null, "A-");
}

else if (score2>86) {
	JOptionPane.showMessageDialog(null, "B+");
}

else if (score2>82) {
	JOptionPane.showMessageDialog(null, "B");
}

else if (score2>79) {
	JOptionPane.showMessageDialog(null, "B-");
}

else if (score2>76) {
	JOptionPane.showMessageDialog(null, "C+");
}

else if (score2>72) {
	JOptionPane.showMessageDialog(null, "C");
}

else if (score2>69) {
	JOptionPane.showMessageDialog(null, "C-");
}

else if (score2>66) {
	JOptionPane.showMessageDialog(null, "D+");
}

else if (score2>62) {
	JOptionPane.showMessageDialog(null, "D");
}

else if (score2>59) {
	JOptionPane.showMessageDialog(null, "D-");
}

else {
	JOptionPane.showMessageDialog(null, "F");
}
}
}
