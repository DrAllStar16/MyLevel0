import javax.swing.JOptionPane;

public class CreateAMethod {
public static void main(String[] args) {
multi(11,11);	
DaQuestion();	
BirthYear(11);	
	
}
//*********************************************************************************************************************

static void DaQuestion( ){
	
	

String Name = JOptionPane.showInputDialog("What is your name");
 
JOptionPane.showMessageDialog(null, "That is an awesome name " + Name);


}

static void BirthYear(int Age){
int yearborn = 2017-Age;
	  JOptionPane.showMessageDialog(null, "You were born in " + yearborn);
}


static void multi(int A, int B){
	
	
	JOptionPane.showMessageDialog(null, " " + (A*B));
}
}
