package Exercise2;

import java.util.Random;

public class Lotto {
	int[] rIntegers;

	Lotto() {
		rIntegers = new int[3];
		Random r = new Random();
		rIntegers[0] = r.nextInt(9) + 1;
		rIntegers[1] = r.nextInt(9) + 1;
		rIntegers[2] = r.nextInt(9) + 1;
	}

	int[] arrayReturn() {

		return this.rIntegers;
	}
}
