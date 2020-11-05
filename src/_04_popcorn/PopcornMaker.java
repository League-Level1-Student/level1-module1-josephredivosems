package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn butter = new Popcorn("popcorn");
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(butter);
	String flavor = JOptionPane.showInputDialog("What Flavor do you want?");
	Popcorn popcorn = new Popcorn(flavor);
	String CookTime = JOptionPane.showInputDialog("How many minutes do you want the Popcorn to be cooked?");
	int minutes = Integer.parseInt(CookTime);
	microwave.setTime(minutes);
	microwave.startMicrowave();
	for (int i = 0; i < 21; i++) {
		popcorn.applyHeat();
	}
	popcorn.eat();
	
}
}
