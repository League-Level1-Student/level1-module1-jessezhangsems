package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornrunner {
public static void main(String[]args) {
	String input=JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	Popcorn popcorn=new Popcorn(input);
	String input1=JOptionPane.showInputDialog("How long do you want to heat it?");
	int num=Integer.parseInt(input1);
	
	Microwave microwave=new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(num);
	microwave.startMicrowave();
	
}
}
