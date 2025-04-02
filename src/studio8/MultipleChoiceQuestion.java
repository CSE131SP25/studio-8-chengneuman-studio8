package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	
	private String prompt;
	private String answer;
	private int points;
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i=0; i<choices.length; i++) {
			System.out.println(choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String[] choices = {"A", "B", "C", "D"};
		MultipleChoiceQuestion a = new MultipleChoiceQuestion ("Why", "A", 10, choices);
		a.displayPrompt();
		System.out.println(a.checkAnswer("B"));
		System.out.println(a.checkAnswer("A"));
	}

}
