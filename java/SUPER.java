class Parent {
    String message = "Hello";

    void displayMessage() {
        System.out.println(message);
    }
}

class Child extends Parent {
    String message = "World";

    void displayBothMessages() {
        super.displayMessage();
        System.out.println(super.message);
        System.out.println(message);
    }
}

public class SUPER {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayBothMessages();
    }
}
