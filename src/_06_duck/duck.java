package _06_duck;

public class duck {
	String favoriteFood;
	int numberOfFriends;
	void quack() {
		System.out.println("Quack!");
	}
	void waddle() {
		System.out.println("Waddle.");
	}
	
	duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	
}
