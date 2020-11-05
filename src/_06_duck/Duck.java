package _06_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;
	
	void quack() {
		System.out.println("Quack");
	}
	
	void waddle() {
		System.out.println("Waddles");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
}
