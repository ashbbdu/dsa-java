package Basics;

public class NestedLoops {
    public static void main(String[] args) {
        for(int j = 1 ; j < 10 ; j++) {
            for(int i = 1 ; i <= 5 ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        for(int i = 1 ; i <= 5 ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
