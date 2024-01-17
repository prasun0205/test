import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, sum=0, r;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0) {
            r = n%10;
            sum = sum+r;
            n = n/10;
        }
        System.out.println("Sum of the digits is "+sum);
    }
}
