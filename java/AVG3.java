import java.util.Scanner;
public class avg3 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Average of three numbers is "+(a+b+c)/3);
    }
}
