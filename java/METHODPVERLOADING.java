public class METHODOVERLOADING {
    int r, l, b;

    double area(int x) {
        return 3.14 * x * x;
    }

    int area(int m, int n) {
        l = m;
        b = n;
        return l * b;
    }

    public static void main(String arg[]) {
        METHODOVERLOADING a = new METHODOVERLOADING();
        System.out.println("Area of Circle: " + a.area(5));
        System.out.println("Area of Rectangle: " + a.area(5, 6));
    }
}
