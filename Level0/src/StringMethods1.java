 public class StringMethods1 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it to whatever you want
String one = "Alex";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(one.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length
System.out.println(one.length());
		// 4. Using a for loop, printone char at time to the console.
		//    HINT: use .length() to determine how many loops

		for (int a = 0; a < one.length(); a++) {
			System.out.println(one.charAt(a));
		}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
		for (int b = 0; b <one.length(); b++) {
if(one.charAt(b)=='A'){
	System.out.println(b);
}
}
		}
	}




