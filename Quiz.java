import javax.swing.JOptionPane;

public class Quiz {
	
	static int nQuestions = 0; // number of questions
	static int nCorrect = 0; // number of correct answers
	
	static String ask(String question) {	
		while(true) {
			// ask the question to the user
			String answer = JOptionPane.showInputDialog(question);
			
			// convert answer to upper case
			answer = answer.toUpperCase();
			
			// check if user provided a valid answer, then return this answer
			if(answer.equals("A") || answer.equals("B") ||answer.equals("C") || answer.equals("D") || answer.equals("E")) {
				return answer;
			}
			// show error message in case the user provided an invalid answer
			else {
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
	
	static void check(String question, String correctAnswer) {
		// increment the number of questions asked
		nQuestions += 1;
		
		// show question to the user
		String answer = ask(question);
		
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

	public static void main(String[] args) {
		// create question #1
		String firstQuestion = "Star Wars: what is the name of Han Solo's ship?\n";
		firstQuestion += "A. Flagship\n";
		firstQuestion += "B. Patrol Cruiser\n";
		firstQuestion += "C. Empire Ship\n";
		firstQuestion += "D. Millennium Falcon\n";
		firstQuestion += "E. Patrol Eagle\n";
		
		// create question #2
		String secondQuestion = "Star Wars: how many languages is C-3PO fluent in?\n";
		secondQuestion += "A. Below five million\n";
		secondQuestion += "B. Below six million\n";
		secondQuestion += "C. Over six million\n";
		secondQuestion += "D. Over eight million\n";
		secondQuestion += "E. Over eight million\n";

		// create question #3
		String thirdQuestion = "Harry Potter: What does the Imperius Curse do?\n";
		thirdQuestion += "A. Mimics\n";
		thirdQuestion += "B. Controls\n";
		thirdQuestion += "C. Kills\n";
		thirdQuestion += "D. Tortures\n";
		thirdQuestion += "E. Jumps\n";

		// ask the user the three questions
		check(firstQuestion, "D");
		check(secondQuestion, "C");
		check(thirdQuestion, "B");
		
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
}
