package Array;

public class Array1 {
//    declaring an array
//    int age[];
//    age = new int[5];
public static void main(String[] args) {
    int age[] = new int[5];
//    age[0] = 1;
//    age[1] = 2;
    System.out.println(age.length + " length");
//    for(int i = 0 ; i <= 5 ; i++) {
//        System.out.println(age[i]);
//    }


//    for each
    for(int agee : age) {
        System.out.println(agee);
    }

//    if we already know the value we can declare the Array like
    int marks[] = {100 , 200 , 300 , 400};
    System.out.println(marks[0]);

    //find the sum of an array
    int employees[] = {23,2,34,12,10,33,89};
    int sum = 0;
    for (int employee : employees) {
//        sum += employee;
        sum = sum + employee;
    }
    System.out.println(sum + " is the total sum");

//    Find minimun number in the array
//    int min = employees[0];
        int min = Integer.MAX_VALUE;
    for(int emp : employees) {
        if(emp < min) {
            min = emp;
        }
    }
    System.out.println(min + " is the smallest number");



}


}

