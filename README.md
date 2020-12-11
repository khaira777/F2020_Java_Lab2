# GurkiratKhaira_COMP228_Sec005_Lab2

Exercise 1: [12 marks]
Write a Java application that simulates a test. The test contains at least five questions about first
three lectures of this course. Each question should be a multiple-choice question with 4 options.
Design an QuestionBank class. Use programmer-defined methods to implement your solution. For
example:
- create a method to simulate the questions – simulateQuestion
- create a method to check the answer – checkAnswer
- create a method to display a random message for the user – generateMessage
- create a method to interact with the user - inputAnswer
Display the questions using methods of JOptionPane class. Use a loop to show all the questions. --
This is optional.
For each question:
- If the user finds the right answer, display a random congratulatory message
(“Excellent!”,”Good!”,”Keep up the good work!”, or “Nice work!”).
- If the user responds incorrectly, display an appropriate message and the correct answer
(“No. Please try again”, “Wrong. Try once more”, “Don't give up!”, “No. Keep trying..”).
- Use random-number generation to choose a number from 1 to 4 that will be used to select
an appropriate response to each answer.
- Use a switch statement to issue the responses, as in the following code:
switch ( randomObject.nextInt( 4 ) )
{
case 0:
return( "Very good!" );
……
}
At the end of the test, display the number of correct and incorrect answers, and the percentage of
the correct answers.
Your main class ( driver class – QuestionBankTest) will simply create an object of QuestionBank
class and start the execution by calling inputAnswer method.

Exercise 2: [10 marks]
Design a Lotto class with one array instance variable to hold three random integer values (from 1 to
9). Include a constructor that randomly populates the array for a lotto object. Also, include a
method in the class to return the array.
Use this class ( in the driver class – LottoTest.java) to simulate a simple lotto game in which the
user chooses a number between 3 and 27. The user runs the lotto up to 5 times and each time the
sum of lotto numbers is calculated. If the number chosen by the user matches the sum, the user
wins and the game ends. If the number does not match the sum within five rolls, the computer
wins.
Use methods of JOptionPane class to interact with the user. – This is optional
Exercise 3: [8 marks]
Write a Java class (SortValues.java) that implements a static method–SortNumbers(int... numbers)
with variable number of arguments. The method should be called with different numbers of
parameters [ for example SortNumbers ( int n1, int n2, int n3, int n4) or SortNumbers ( int n1, int
n2, int n3, int n4, int n5, int n6)] and does arrange the numbers in descending order. Call the
method within main method of the driver class (SortTest.java) and display the results.
