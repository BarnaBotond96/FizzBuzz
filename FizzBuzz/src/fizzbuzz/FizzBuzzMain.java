package fizzbuzz;

import java.util.Scanner;

import fizzbuzz.inputmanager.UserInputManager;
import fizzbuzz.validator.NumberValidator;
import fizzbuzz.validator.Validator;

public class FizzBuzzMain {

	public static void main(String[] args) {

		NumberTagger[] taggers = { new FizzTagger(), new BuzzTagger() };
		Scanner scanner = new Scanner(System.in);
		UserInputManager in = new UserInputManager(scanner);
		int userChoice;
		boolean isValid;
		do {
			userChoice = in.readInt("Please, enter a number from 10 to 100!");
			Validator validator = new NumberValidator(userChoice);
			isValid = validator.isValid();
		} while (!isValid);
		for (int number = 1; number <= userChoice; number++) {
			spaces(number);
			System.out.print(number);
			for (NumberTagger tagger : taggers) {
				System.out.print(tagger.isToBeTagged(number) ? " " + tagger.getTag() : "");
			}
			System.out.println();
		}
	}

	private static void spaces(int number) {
		if (number < 10) {
			System.out.print("  ");
		} else if (number >= 10 && number < 100) {
			System.out.print(" ");
		}
	}
}