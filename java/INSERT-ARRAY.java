import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int a[] = new int[10];
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = s.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter the position of the element to be inserted: ");
        int pos = s.nextInt();
        System.out.println("Enter the element to be inserted: ");
        int ele = s.nextInt();
        for(i=n-1;i>=pos-1;i--){
            a[i+1] = a[i];
        }
        a[pos] = ele;
        n++;
        System.out.println("The array after insertion is: ");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }

}
