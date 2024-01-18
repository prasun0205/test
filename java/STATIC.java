public class MyCounter {
    static int count = 5;

    MyCounter() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        MyCounter c1 = new MyCounter();
    }
}
