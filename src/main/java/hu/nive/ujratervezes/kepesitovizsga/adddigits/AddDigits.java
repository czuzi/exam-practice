package hu.nive.ujratervezes.kepesitovizsga.adddigits;

public class AddDigits {

	public int addDigits(String input) {
		int res = 0;
		if (input == null || input.equals("")) {
			return -1;
		}
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				res += Character.getNumericValue(input.charAt(i));
			}
		}
		return res;
	}
}
