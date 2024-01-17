import java.util.Scanner;

class Person {
    String sname, rollno;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person and roll no");
        sname = sc.next();
        rollno = sc.next();
    }
}

class Student extends Person {
    int s1, s2;
    int tot, avg;

    void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for subject 1 and subject 2:");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        tot = s1 + s2;
        avg = tot / 2;
    }

    void display() {
        System.out.println("Total marks of the student is " + tot);
        System.out.println("Average marks of the student is " + avg);
    }
}

public class SI {
    public static void main(String arg[]) {
        Student student = new Student();
        student.getdata();
        student.calculate();
        student.display();
    }
}
