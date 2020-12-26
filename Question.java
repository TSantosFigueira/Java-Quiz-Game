import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0; // number of questions
	static int nCorrect = 0; // number of correct answers
	QuestionDialog question;
	String correctAnswer;
	
	Question(String question){
		// initialize question
		this.question = new QuestionDialog();
		// create grid layout for buttons
		this.question.setLayout(new GridLayout(0,1));
		// add question to the window and center it
		this.question.add(new JLabel(" "+ question + " ", JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		// prevent the dialog box from returning control to the program until it is disposed
		this.question.setModal(true);
		// resize this dialog box based on its contents
		this.question.pack();
		// center this dialog box on the screen
		this.question.setLocationRelativeTo(null);
	}
	
	String ask() {
		// make the question dialog visible
		question.setVisible(true);
		// return the answer
		return question.answer;
	}
	
	void check() {
		// increment the number of questions asked
		nQuestions += 1;
		
		// show question to the user
		String answer = ask();
		
		// check if the answer is correct
		if(answer.equals(correctAnswer)) {
			// if it is, increment the number of correct answers
			nCorrect += 1;
			// show success message to the user
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			// show the correct answer to the user
			JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + correctAnswer);
		}
	}
	
	// show how many questions the user got right
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
}
