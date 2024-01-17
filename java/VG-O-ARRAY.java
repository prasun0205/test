import java.util.*;
class Main {
    public static void main(String arg[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  array size");
        n = sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter  array value");
        for (i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        int sum=0;
        for (i = 0; i < a.length; i++)
            sum+=a[i];
        System.out.println("average of array is "+(sum/n));
    }
}
