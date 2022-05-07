package subjects;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("doSomeWork() inside ConcreteSubject is invoked.");
    }
}
