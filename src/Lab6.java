import java.util.Random;
import java.util.Scanner;

// Anthony Reakoff and Victoria Rush 4/30/18 Lab 6

public class Lab6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String cont = " ";
		// comments
		do {
			int side = Validator.getInt(scnr, "How many sides should each die have? ");
			int num1 = RNG(side);
			int num2 = RNG(side);
			
			//more comments
			if (num1 + num2 == 2) {
				System.out.println("Snake eyes");
			}
			if (num1 == 6 && num2 == 6) {
				System.out.println("Boxcar racer");
			}
			if ((num1 + num2 == 7) || (num1 + num2 == 11)) {
				System.out.println("Dont crap out on me now");
			}
			// last comment
			cont = Validator.getString(scnr, "Would you like to continue? y/n");
		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");

	}
	
	//method
	public static int RNG(int Side) {
		Random rng = new Random();
		int num = rng.nextInt(Side) + 1;
		System.out.println(num);
		return num;
	}
}
