package subjects;

import java.util.*;

public class Proxy extends Subject {
    private static Subject _subject;
    private String _currentUser;
    private List<String> _registeredUsers;

    public Proxy() {
        _registeredUsers = new ArrayList<String>();
    }

    public String getCurrentUser() {
        return _currentUser;
    }

    public void setCurrentUser(String currentUser) {
        _currentUser = currentUser;
    }

    public void registerUser(String user) {
        _registeredUsers.add(user);
    }

    @Override
    public void doSomething() {
        if (checkCurrentUser()) {
            initializeSubject();
            _subject.doSomething();
        } else {
            System.out.printf("Sorry %s, you do not have access rights.", _currentUser);
        }
    }

    private boolean checkCurrentUser() {
        return _registeredUsers.contains(_currentUser);
    }

    private void initializeSubject() {
        // Lazy initialization
        if (_subject == null) {
            _subject = new ConcreteSubject();
        }
    }
}
