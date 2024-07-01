package Basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = a / b;
        System.out.println(c);
        double d = (double)a /b;
        System.out.println(d);
        System.out.println(12 == 2);

//        taking user input
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age ! ");
//        int age = sc.nextInt();
//        System.out.println("Your age is " + age);
//        sc.close();

//        ternary operator
        int age = 17;
        age =    age >= 18 ?  ++age :  --age;
        System.out.println(age);

        System.out.println("Enter a day !");
        int day = sc.nextInt();
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }
}
