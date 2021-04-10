package fizzbuzz;

public abstract class AbstractNumberTagger implements NumberTagger {

	private int numberToCheck;
	private String tag;

	public AbstractNumberTagger(int numberToCheck, String tag) {
		this.numberToCheck = numberToCheck;
		this.tag = tag;
	}

	@Override
	public boolean isToBeTagged(int number) {
		if (number % numberToCheck == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String getTag() {
		return tag;
	}
}