package Exercise2;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		for (int i = 0; i < 5; i++) {
			Lotto lotto = new Lotto();

			int[] lottoArray = lotto.arrayReturn();
			int sum = lottoArray[0] + lottoArray[1] + lottoArray[2];
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose a number between 3 and 27");
			int answer = sc.nextInt();

			if (answer == sum) {
				System.out.println("you won");
				flag++;
				break;
			} else {
				System.out.println("try again");
			}

		}
		if (flag == 0) {
			System.out.println("Computer won, better luck next time");
		}
	}

}
