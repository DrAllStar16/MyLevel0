import javax.swing.JOptionPane;

public class AmazingPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
static int HappyNess= 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String Pet=JOptionPane.showInputDialog("What pet would you like to buy");
		// 6. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i <100; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would u like to do with your pet", "A pets life", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "PlayBall", "Cuddle", "GoOnAWalk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			
			if (task==0) {
				PlayBall();
			}
			
			if (task==1) {
				Cuddle();
			}
			
			if (task==2) {
				Walking();
			}
		
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (HappyNess==10) {
				JOptionPane.showMessageDialog(null, "You pet is full of energy and super happy");
				break;
			}
			
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void PlayBall(){
		
		JOptionPane.showMessageDialog(null, " Your pet had a ball") ;
		
		HappyNess++;
	}
	
	static void Cuddle(){
		
		JOptionPane.showMessageDialog(null, " I'm sleepy") ;
		
		HappyNess++;
	}
	
	static void Walking(){
		
		JOptionPane.showMessageDialog(null, " We walked  a lot") ;
		
		HappyNess++;
	}
}
