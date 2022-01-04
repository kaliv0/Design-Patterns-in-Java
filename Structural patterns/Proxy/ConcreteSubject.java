package protectionProxy;

public class ConcreteSubject extends Subject {

//nevertheless you could still invoke the method through an instance of that class?!
	@Override
	protected void doSomething() {
		System.out.println("doSomeWork() inside ConcreteSubject is invoked.");

	}

}
