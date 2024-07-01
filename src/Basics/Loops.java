package Basics;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        Table
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(n+ " * " + i + " = " + n * i);
        }

//        find sum of first n numbers
        int sum = 0;
        for(int i = 0 ; i <= n ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        System.out.println();
        System.out.println();

//        while loop
        int a = 1;
        while(a <= 5) {
            System.out.println(a);
            a++;
        }
    }
}
