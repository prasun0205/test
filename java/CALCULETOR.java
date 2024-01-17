import java.util.Scanner;
public class calculetor {
    public static void main(String[] args) {
        int a,b,c,s,m,d,mod;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        s = a-b;
        m = a*b;
        d = a/b;
        mod = a%b;
        System.out.println("Addition of two numbers is "+c);
        System.out.println("Subtraction of two numbers is "+s);
        System.out.println("Multiplication of two numbers is "+m);
        System.out.println("Division of two numbers is "+d);
        System.out.println("Modulus of two numbers is "+mod);
    }
}
