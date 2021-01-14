package _06_duck;

public class Cat {
void purr() {
	System.out.println("Purr");
}
void meow() {
	System.out.println("Meow");
}
String color;
String personality;

Cat(String color, String personality){
	this.color=color;
	this.personality=personality;
}
}
