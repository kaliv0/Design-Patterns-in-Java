package ProtectionProxy;

import java.util.*;

public class Proxy extends Subject {

	private static Subject subject;
	private String currentUser;
	private List<String> registeredUsers;

	// ctor
	public Proxy() {

		this.registeredUsers = new ArrayList<String>();
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	public void registerUser(String user) {

		this.registeredUsers.add(user);

	}

	@Override
	public void doSomething() {

		if (checkCurrentUser()) {

			initializeSubject();
			subject.doSomething();

		} else {

			System.out.println("Sorry " + currentUser + " , you do not have access rights.");
		}

	}

	private boolean checkCurrentUser() {

		boolean flag = false;

		if (this.registeredUsers.contains(this.currentUser)) {

			flag = true;
		}

		return flag;
	}

	private void initializeSubject() {

		// Lazy initialization
		if (subject == null) {
			subject = new ConcreteSubject();
		}
	}

}
