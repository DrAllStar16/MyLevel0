// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
  String nickles=JOptionPane.showInputDialog("how many nickles to you have");
		// Convert their answer to an int using Integer.parseInt()
int gingerisapooped=Integer.parseInt(nickles);
		// Ask the user how many dimes they have, and convert their answer
String dimes=JOptionPane.showInputDialog("how many dimes to you have");
int oliviaisapooped=Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters=JOptionPane.showInputDialog("how many quarters to you have");
int izzyisapooped=Integer.parseInt(dimes);
		// Calculate how much money the user has and save it in a double variable 
double amount=(gingerisapooped*5)+(oliviaisapooped*10)+(izzyisapooped*25);
amount=amount/100;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " +amount+ " dollars");
	}
}
