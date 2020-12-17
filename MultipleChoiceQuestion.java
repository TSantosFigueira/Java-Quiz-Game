import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
		
	public MultipleChoiceQuestion(String query, String a, String b, String
			c, String d, String e, String answer) {
		// initialize question 
		question = query + "\n";
		// add question options
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		// initialize the correct answer
		correctAnswer = answer;
	}
	
	String ask() {	
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
}
