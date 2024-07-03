interface User {
    public abstract void displayRole();
}

class Admin implements User {
    public void displayRole() {
        System.out.println("I am an Admin.");
    }
}

class Seller implements User {
    public void displayRole() {
        System.out.println("I am a Seller.");
    }
}

class Buyer implements User {
    public void displayRole() {
        System.out.println("I am a Buyer.");
    }
}

class Visitor implements User {
    public void displayRole() {
        System.out.println("I am a Visitor.");
    }
}

class special implements User {
    public void displayRole() {
        System.out.println("I am a special user");
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
        } else if (type.equals("Visitor")) {
            return new Visitor();
        } else if (type.equals("special")) {
            return new special();
        }
        return null;
    }
}
