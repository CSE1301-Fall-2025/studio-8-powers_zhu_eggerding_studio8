package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * 
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String[] choices;

	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
	}

	/**
	 * Display the prompt for the question in addition to
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < choices.length; i++) {
			System.out.println(i + 1 + ". " + choices[i]);
		}
	}

	/**
	 * Getter method for the available choices
	 * 
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}

	public static void main(String[] args) {
		String[] q2Answers = { "1301", "231", "425", "131" };
		MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("What class?", "1301", 2, q2Answers);
		System.out.println(q2.checkAnswer("131"));
		// q2.checkAnswer("1301");
		q2.getPoints();

	}

}
