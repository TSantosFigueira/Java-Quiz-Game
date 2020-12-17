import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	public TrueFalseQuestion (String question, String answer) {
		this.question = "TRUE or FALSE: " + question;
		
		// convert answer to upper case
		answer = answer.toUpperCase();
		
		// check if the correct answer is FALSE			
		if(answer.equals("F") || answer.equals("FALSE") ||answer.equals("N") || answer.equals("NO")) {
			this.correctAnswer = "FALSE";
		}
		// check if the correct answer is TRUE
		else if(answer.equals("T")|| answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
			this.correctAnswer = "TRUE";
		}
	}

	@Override
	String ask() {
		while(true) {
			// ask the question to the user
			String answer = JOptionPane.showInputDialog(question);
			
			// convert answer to upper case
			answer = answer.toUpperCase();
			
			// check if user provided a valid answer, then return this answer
			// check if the answer is FALSE			
			if(answer.equals("F") || answer.equals("FALSE") ||answer.equals("N") || answer.equals("NO")) {
				return "FALSE";
			}
			// check if the answer is TRUE
			else if(answer.equals("T")|| answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
				return "TRUE";
			}
			// show error message in case the user provided an invalid answer
			else {
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
			}
		}
	}

}
