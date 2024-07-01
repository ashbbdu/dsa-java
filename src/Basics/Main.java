package Basics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Basics.Main.Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class Hello {
        public static  void main (String[] args) {
            System.out.println("Basics.Main.Hello World !");
            System.out.println("4"+"3");
    //        int age = 24;
    //        int aGe = 26;
            boolean isValid = false;
            System.out.println(isValid);
            boolean marks;
            marks = true;
            System.out.println(marks);
    //        byte totalMarks = 14;
            if(marks) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            long ash = 30;
    //        System.out.println(ash);
    //        intArray = new int[20];

        }
    }
}