package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar carrace=new RaceCar("Toyota",5);
	System.out.println(carrace.getPositionInRace());
	carrace.crash();
	if(carrace.damaged) {
		carrace.pit();
	}
	while(carrace.getPositionInRace()!=1) {
		carrace.overtake();
	}
		// 2. Print the RaceCar's position in the race

		// 3. Crash the RaceCar
		
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
}
