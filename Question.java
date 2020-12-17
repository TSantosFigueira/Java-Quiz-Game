import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0; // number of questions
	static int nCorrect = 0; // number of correct answers
	String question;
	String correctAnswer;
	
	// abstract declaration for ask()
	abstract String ask();
	
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
