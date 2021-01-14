package _06_duck;

public class duckrunner {
	public static void main(String[]args) {
		duck daffy = new duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		dog pluto= new dog("golden","loving");
		pluto.fetch();
		pluto.eat();
		pluto.bark();
		pluto.walk();
		Cat tom= new Cat("spotted","cute");
		tom.meow();
		tom.purr();
	}
	
}
