import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 values for the array:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
        int max = a[0]; 
        int min = a[0];
        
        for (int i = 0; i < 5; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        
        System.out.println("Maximum value of the array is: " + max);
        System.out.println("Minimum value of the array is: " + min);
    }
}
