package Array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        a[2][2] = 10;
        System.out.println(a[2][1]);

        int marks[][] = {
                {12 , 98 , 12},
                {14 , 67 , 34},
                {34 , 56 , 89}
        };
        System.out.println(marks[0][1]);
    }
}
