import java.util.Scanner;
public class areaofrectangle {
    public static void main(String[] args) {
    int l,b,area,perimeter;
    System.out.println("Enter the length and breadth of the rectangle");
    Scanner sc = new Scanner(System.in);
    l = sc.nextInt();
    b = sc.nextInt();
    area = l*b;
    perimeter = 2*(l+b);
    System.out.println("The area of the rectangle is "+area);
    System.out.println("The perimeter of the rectangle is "+perimeter);
    }
}
