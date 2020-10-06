package Exercise1;

public class QuestionBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionBank question1 = new QuestionBank("What is the default value of Object variable?", "undefined", "0",
				"null", "not defined", "c");
		question1.inputAnswer();

		QuestionBank question2 = new QuestionBank("What is the default value of short variable?", "0.0", "0", "null",
				"not defined", "b");
		question2.inputAnswer();

		QuestionBank question3 = new QuestionBank("Method Overloading is an example of", "static binding",
				"dynamic binding", "both", "none", "a");
		question3.inputAnswer();

		QuestionBank question4 = new QuestionBank("Java is a ___ programming language.", "Functional",
				"Object-Oriented", "Theoretical", "All the above", "b");
		question4.inputAnswer();
		QuestionBank question5 = new QuestionBank("In Java programming language, the code is placed inside ___.",
				"Classes, Interfaces", "Methods", "Blocks", "All the above", "d");
		question5.inputAnswer();

		QuestionBank.result();
	}

}
