

public class Quiz {

	public static void main(String[] args) {
		
		// create question #1
		MultipleChoiceQuestion firstQuestion = new MultipleChoiceQuestion(
				"Star Wars: what is the name of Han Solo's ship?",
				"Flagship",
				"Patrol Cruiser",
				"Empire Ship",
				"Millennium Falcon",
			    "Patrol Eagle",
			     "D");
		
		// create question #2
		MultipleChoiceQuestion secondQuestion = new MultipleChoiceQuestion(
				"Star Wars: how many languages is C-3PO fluent in?",
				"Below five million",
				"Below six million",
				"Over six million",
				"Over eight million",
			    "Over ten million",
			    "C");
	
		// create question #3
		MultipleChoiceQuestion thirdQuestion = new MultipleChoiceQuestion(
				"Star Wars: Who was offered and turned down the part of Han Solo in the original"
				+ "Star Wars film?",
				"Sylvester Stallone",
				"Bruce Willis",
				"Roger Moore",
				"Al Pacino",
			    "Sean Connery",
			    "D");
		
		//create question #4
		MultipleChoiceQuestion fourthQuestion = new MultipleChoiceQuestion(
				"Harry Potter: What does the Imperius Curse do?",
				"Mimics",
				"Controls",
				"Kills",
				"Tortures",
			    "Jumps",
			    "B");
		
		//create question #5
		MultipleChoiceQuestion fifthQuestion = new MultipleChoiceQuestion(
				"Harry Potter: How long is the first movie (The Philosopher's Stone)?",
				"1.5 hours",
				"2.5 hours",
				"3.5 hours",
				"4 hours",
			    "4.5 hours",
			    "B");

		// ask the user all questions
		firstQuestion.check();
		secondQuestion.check();
		thirdQuestion.check();
		fourthQuestion.check();
		fifthQuestion.check();
		
		// after answering all the question, show results to the user
		MultipleChoiceQuestion.showResults();
	}
}
