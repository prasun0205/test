import java.util.*;

class A {
    A() {
        System.out.println("A");
    }
}
class B extends A {
    B() {
        System.out.println("B");
    }
}

class C extends A {
    C() {
        System.out.println("C");
    }

    public static void main(String args[]) {
        B b = new B();
        C c = new C();
    }
}
