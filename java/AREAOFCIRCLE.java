import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        int r; double p,s,pi=3.14;
        System.out.println("Enter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        s = pi*r*r;
        p=2*pi*r;
        System.out.println("Area of the circle is "+s);
        System.out.println("Perimeter of the circle is "+p);
    }
}
