package fizzbuzz.validator;

public class NumberValidator implements Validator {

	private int userChoice;

	public NumberValidator(int userChoice) {
		this.userChoice = userChoice;
	}

	@Override
	public boolean isValid() {
		if (userChoice >= 10 && userChoice <= 100) {
			return true;
		}
		return false;
	}
}