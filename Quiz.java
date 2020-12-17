

public class Quiz {

	public static void main(String[] args) {
		
		// create question #1
		Question firstQuestion = new MultipleChoiceQuestion(
				"Star Wars: what is the name of Han Solo's ship?",
				"Flagship",
				"Patrol Cruiser",
				"Empire Ship",
				"Millennium Falcon",
			    "Patrol Eagle",
			     "D");
		
		// create question #2
		Question secondQuestion = new MultipleChoiceQuestion(
				"Star Wars: how many languages is C-3PO fluent in?",
				"Below five million",
				"Below six million",
				"Over six million",
				"Over eight million",
			    "Over ten million",
			    "C");
	
		// create question #3
		Question thirdQuestion = new MultipleChoiceQuestion(
				"Star Wars: Who was offered and turned down the part of Han Solo in the original"
				+ "Star Wars film?",
				"Sylvester Stallone",
				"Bruce Willis",
				"Roger Moore",
				"Al Pacino",
			    "Sean Connery",
			    "D");
		
		//create question #4
		Question fourthQuestion = new MultipleChoiceQuestion(
				"Harry Potter: What does the Imperius Curse do?",
				"Mimics",
				"Controls",
				"Kills",
				"Tortures",
			    "Jumps",
			    "B");
		
		//create question #5
		Question fifthQuestion = new MultipleChoiceQuestion(
				"Harry Potter: How long is the first movie (The Philosopher's Stone)?",
				"1.5 hours",
				"2.5 hours",
				"3.5 hours",
				"4 hours",
			    "4.5 hours",
			    "B");
		
		//create question #6
		Question sixthQuestion = new TrueFalseQuestion("UoPeople is tution free?", "TRUE");
		//create question #7
		Question seventhQuestion = new TrueFalseQuestion("Christmas happens on January 1st?", "FALSE");
		//create question #8
		Question eigthQuestion = new TrueFalseQuestion("Joe Biden is the new president of the US?", "TRUE");
		//create question #9
		Question ninethQuestion = new TrueFalseQuestion("Google owns Windows 10?", "FALSE");
		//create question #10
		Question tenthQuestion = new TrueFalseQuestion("Microsoft owns Xbox?", "TRUE");

		// ask the user all questions
		firstQuestion.check();
		secondQuestion.check();
		thirdQuestion.check();
		fourthQuestion.check();
		fifthQuestion.check();
		sixthQuestion.check();
		seventhQuestion.check();
		eigthQuestion.check();
		ninethQuestion.check();
		tenthQuestion.check();		
		
		// after answering all the question, show results to the user
		Question.showResults();
	}
}
