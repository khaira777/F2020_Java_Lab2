package Exercise3;

public class SortValues {
	static void sortNumber(int... numbers) {

		for (int i = 1; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				int temp;
				if (numbers[j] < numbers[j - 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;
				}
			}
		}
		int last = numbers.length - 1;
		int middle = numbers.length / 2;
		for (int i = 0; i <= middle; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[last - i];
			numbers[last - i] = temp;
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}