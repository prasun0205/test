import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[]a=new int[5];
        int i,s=0;
        System.out.println("Enter the elements of array");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            s=s+a[i];
        }
        System.out.println("Sum of array elements is "+s);
    }
}
