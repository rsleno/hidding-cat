
public class Guess {
	private int guess;
	private Cat cat;
	
	public Guess(int guess, Cat cat) {
		this.setGuess(guess);
		this.setCat(cat);
	}
	
	public boolean checkGuess() {
		return guess == cat.getBox();
	}
	
	public int getGuess() {
		return guess;
	}
	
	public void setGuess(int guess) {
		this.guess = guess;
	}
	
	public Cat getCat() {
		return this.cat;
	}
	
	public void setCat(Cat cat) {
		this.cat = cat;
	}	

}
