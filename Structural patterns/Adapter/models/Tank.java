//Adaptee
package adapter.models;

import java.util.Random;

public class Tank {

	Random generator = new Random();

	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy tank does " + attackDamage + " damage");
	}

	public void driveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy tank moves " + movement + " spaces");

	}

	public void assignDriver(String driverName) {
		System.out.println(driverName + " is driving the tank");

	}
}
