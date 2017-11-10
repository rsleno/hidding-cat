import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of boxes: ");
		int numBoxes = sc.nextInt();
        System.out.println("Enter sequence: ");
        char[] sequence=sc.next().toCharArray();
        sc.close();
        
        Cat cat = new Cat(numBoxes);
        for (int i=0;i<sequence.length;i++) {
        	System.out.println("The cat is in box: " + cat.getBox());
            System.out.println("Guess: " + sequence[i]);
        	Guess guess = new Guess(Character.getNumericValue(sequence[i]), cat);
        	if (guess.checkGuess())
        		return;
        	cat.move();
        }
        

	}

}
