package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornrunner {
public static void main(String[]args) {
	String input=JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	Popcorn popcorn=new Popcorn(input);
	
}
}
