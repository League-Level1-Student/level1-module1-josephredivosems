package _04_popcorn;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn butter = new Popcorn("butter");
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(butter);
	
	
}
}
