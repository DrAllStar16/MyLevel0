// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class Airline_Registion {
public static void main(String[] args) {
	
String FName= JOptionPane.showInputDialog(" What is your first name ");
String  LName=JOptionPane.showInputDialog(" What is your last name ");
String Goingto=JOptionPane.showInputDialog(" Where are you going ");
String birthday=JOptionPane.showInputDialog(" What is you birthday 0/0/0 ");
String gender=JOptionPane.showInputDialog(" Are you male or female ");
String going= " Traveling to: ";	
String hash = " / ";
String com= " , ";
String left=" ( ";
String right=" ) ";
	JOptionPane.showMessageDialog(null,  "" + LName + hash + FName  + left + birthday + com + gender + right + going + Goingto );
	
	
	
}
}






/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
