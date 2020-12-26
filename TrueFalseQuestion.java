import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	public TrueFalseQuestion (String question, String answer) {
		
		super(question);
		
		// buttons panel
		JPanel buttons = new JPanel();
		
		// add buttons
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		
		// add the buttons panel to this dialog box
		this.question.add(buttons);
		
		initQuestionDialog();
		
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
	
	// method to create a button
	private void addButton(JPanel buttons, String label) {
		// create button with the provided label
		JButton button = new JButton(label);
		// add click event handler
		button.addActionListener(question);
		// add button to the panel
		buttons.add(button);
	}

}
