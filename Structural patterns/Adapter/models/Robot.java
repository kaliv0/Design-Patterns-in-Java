package adapter.models;

import adapter.contracts.Attacker;

import java.util.Random;

public class Robot implements Attacker {

	Random generator = new Random();

	public void attack() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy robot causes " + attackDamage + " damage");
	}

	public void moveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy robot moves " + movement + " spaces");

	}

	public void reactToHuman(String humanName) {
		System.out.println("Enemy robot trams on " + humanName);

	}
}
