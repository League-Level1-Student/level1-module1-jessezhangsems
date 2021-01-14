package _06_duck;

public class dog {
void fetch() {
	System.out.println("Fetch.");
}
void eat() {
	System.out.println("Eat.");

}
void bark() {
	System.out.println("Woof!");
}
void walk() {
	System.out.println("Walk.");
}
String color;
String personality;
dog(String color, String personality){
	this.color=color;
	this.personality=personality;

}
}



