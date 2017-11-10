import java.util.Random;

public class Cat {
	private int box;
	private int[] array;
	
	public Cat(int boxes) {
		array = new int[boxes];
		for (int i=0; i<boxes; i++)
			array[i]=i+1;
		int startBox = this.start();
		this.setBox(startBox);
	}
	
	public int start() {
		return this.randomPick(array);
	}
	
	public void move() {
		int currentBox = this.getBox();
		int newBox;
		if (currentBox == array[0]) {
			newBox = currentBox + 1;
		} else if (currentBox == array[array.length - 1]) {
			newBox = currentBox -1;
		} else {
			int[] boxes = {currentBox-1, currentBox+1};
			newBox = this.randomPick(boxes);
		}
		this.setBox(newBox);
	}
	
	private int randomPick(int[] boxes) {
		int rnd = new Random().nextInt(boxes.length);
		return boxes[rnd];
	}
	
	public int getBox() {
		return box;
	}
	
	public void setBox(int box) {
		this.box = box;
	}
	
	public int[] getArray() {
		return array;
	}
	
}
