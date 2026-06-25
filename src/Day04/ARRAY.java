package Day04;

import java.util.ArrayList;
import java.util.LinkedList;
import  java.util.List;
import java.util.Scanner;
public class ARRAY {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        List<String> stud = new LinkedList<>();

        stud.add("new");



        students.add("Rahul");

        System.out.println(" this is "+students +" Linklist OUtput "+stud);




//        taking input from the user in arraylist

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println(" Enter the How Many Students U want to enter in Array list");

        n = sc.nextInt();
        List<String> Student = new ArrayList<>();
        System.out.println(" only enter the "+n+"students");

            for (int i = 0 ; i<=n ;i++){
                String name = sc.nextLine();

                Student.add(name);

            }

            for (int i =0 ; i<=n ; i++){
                System.out.println(" "+Student.get(i));
            }






    }
}
