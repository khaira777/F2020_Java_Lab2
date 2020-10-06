package Exercise3;

public class SortValues {
	static void sortNumber(int... numbers) {
		int n = numbers.length;

		for (int i = 0; i < n - 1; i++) {
			int start = i;
			for (int j = i + 1; j < n; j++)
				if (numbers[j] < numbers[start])
					start = j;

			int next = numbers[start];
			numbers[start] = numbers[i];
			numbers[i] = next;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
