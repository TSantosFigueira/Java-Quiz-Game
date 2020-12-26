import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
		
	public MultipleChoiceQuestion(String query, String a, String b, String
			c, String d, String e, String answer) {
		
		super(query);
		
		// add choices
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);
		
		initQuestionDialog();
		
		// initialize the correct answer
		correctAnswer = answer;		
	}
	
	@Override
	String ask() {
		// make the question dialog visible
		question.setVisible(true);
		// return the answer
		return question.answer;
	}
	
	void addChoice(String name, String label) {
		// create a panel using BorderLayout
		JPanel choice = new JPanel(new BorderLayout());
		// create a button with the given name
		JButton button = new JButton(name);
		// add click event handler
		button.addActionListener(question);
		// add this button to the choice panel
		choice.add(button,BorderLayout.WEST);
		// align the text to the left
		choice.add(new JLabel(label + " ", JLabel.LEFT), BorderLayout.CENTER);
		// add choice to the dialog box
		question.add(choice);
	}
}
