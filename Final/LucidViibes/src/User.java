abstract class User {
    public abstract void displayRole();
}

class Admin extends User {
    public void displayRole() {
        System.out.println("I am an Admin.");
    }
}

class Seller extends User {
    public void displayRole() {
        System.out.println("I am a Seller.");
    }
}

class Buyer extends User {
    public void displayRole() {
        System.out.println("I am a Buyer.");
    }
}

class UserFactory {
    public User createUser(String type) {
        if (type.equals("Admin")) {
            return new Admin();
        } else if (type.equals("Seller")) {
            return new Seller();
        } else if (type.equals("Buyer")) {
            return new Buyer();
        }
        return null;
    }
}
