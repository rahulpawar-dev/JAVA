package Day01;

import java.util.Scanner;


public class basic {
    public static void main(String args[]){

//    public int myfunc(){
//        System.out.println("this is from the function ");
//
//        return 0;
//    }
//    public static void main(String args[]){
//        System.out.println("hello this is Rahul ");
//
         Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("enter the Ur RollNumber");
//
//        int n = sc.nextInt();
//
//
//        System.out.println(" UR Roll Number =   " + n);
//
//        System.out.println(" Enter the ur Name ");
//        String Name = sc.next();
//
//        System.out.println("ur name is ="+Name);
//
//
//
//
//        Day01.basic obj = new Day01.basic();
//
//        obj.myfunc();


//    performing Arithemetic operation by taking value from the user

//    System.out.println("Enter the First Number");


//    int a = sc.nextInt();
//
//    System.out.println("Enter the Second Number ");
//    int b = sc.nextInt();
//
//
//        System.out.println("Addition Of two Number ="+(a+b));
//        System.out.println("Multiplication Of two Number ="+(a*b));
//        System.out.println("Subtraction Of two Number ="+(a-b));
//        System.out.println("Divide Of two Number ="+(a/b));


//        System.out.println("Enter the User Age");
//
//        int age = sc.nextInt();
//
//        if(age>=18){
//            System.out.println("the User age is Valid for Driving");
//        }
//        else if (age <17) {
//            System.out.println("the User is Under age ");
//        }
//
//        else {
//            System.out.println("enter the Proper age");
//        }


        System.out.println("enter the number which u want to Which day Number is ");
        int day = sc.nextInt();



        if(day<=7 & day>0) {


            switch (day) {
                case 1:
                    System.out.println("the day is monday");
                    break;
                case 2:
                    System.out.println("the day is Tuesday");
                    break;
                case 3:
                    System.out.println("the day is Wensday ");
                    break;
                case 4:
                    System.out.println("the day is Thursday");
                    break;

                case 5:
                    System.out.println("the day is Friday");
                    break;
                case 6:
                    System.out.println("the day is Saturday");
                    break;
                case 7:
                    System.out.println("the day is Sunday");
                    break;


            }
        }

        else{
            System.out.println("Enter the valid Number");
        }

    }
}
