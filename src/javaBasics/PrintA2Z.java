package javaBasics;

public class PrintA2Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char character;

		// Display Upper Case Alphabets
		System.out.print("Upper Case Alphabets Displayed \n");
		for (character = 'A'; character <= 'Z'; character++)
			System.out.print(character + " ");

		System.out.print("\n\n");// move to next line

		// Display Lower Case Alphabets
		System.out.print("Lower Case Alphabets Displayed \n");
		for (character = 'a'; character <= 'z'; ++character)
			System.out.print(character + " ");
		
	}

}
