package fizzbuzz.inputmanager;

import java.util.Scanner;

public class UserInputManager {

	private Scanner scanner;

	public UserInputManager(Scanner scanner) {
		this.scanner = scanner;
	}

	public int readInt(String message) {
		System.out.println(message);
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}
}