package Exercise1;
import java.util.Random;
import java.util.Scanner;

public class QuestionBank {
	static int flag = 0;
	static int totalQue = 0;
	String answer;

	QuestionBank(String que, String a, String b, String c, String d, String answer) {
		System.out.println(que + "\n");
		System.out.println("a. " + a + "\n");
		System.out.println("b. " + b + "\n");
		System.out.println("c. " + c + "\n");
		System.out.println("d. " + d + "\n");
		this.answer = answer.toLowerCase();
	}

	public String simulateQuestion() {
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine().toLowerCase();
		return answer;
	}

	public String checkAnswer(String answer) {
		String message;
		if (answer.equals(this.answer)) {
			message = generateMessage("correct");
			System.out.println(message+"\n");
			flag++;
			return message;
		} else {
			message = generateMessage("wrong");
			System.out.println(message+"\n");
			return message;
		}
	}

	public String generateMessage(String solution) {
		Random rand = new Random();
		int choice = rand.nextInt(4);
		if (solution.equals("correct")) {
			switch (choice) {
			case 0:
				return "Excellent!";
			case 1:
				return "Good!";
			case 2:
				return "Keep up the good work!";
			case 3:
				return "Nice work!";
			}
		} else {
			switch (choice) {
			case 0:
				return "No. Please try again";
			case 1:
				return "Wrong. Try once more";
			case 2:
				return "Don't give up!";
			case 3:
				return "No. Keep trying..";
			}
		}
		return null;
	}

	void inputAnswer() {
		totalQue++;
		checkAnswer(simulateQuestion());
	}

	static void result() {
		System.out.println(flag + " correct of total " + totalQue + " questions.\nPecentage correct: "
				+ (((float) flag / totalQue) * 100));
	}
}
