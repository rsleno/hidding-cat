
public class Game {

	public static void main(String[] args) {
		Cat cat = new Cat();
		for (int i=1; i<6; i++) {
			Guess guess = new Guess(i, cat);
			System.out.println(guess.checkGuess());
			cat.move();
		}

	}

}
