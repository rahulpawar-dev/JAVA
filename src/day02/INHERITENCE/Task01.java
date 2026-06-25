package day02.INHERITENCE;

import day02.Task03;

public class Task01 {



    Task01(String name){
        System.out.println("the Name of student = " + name);

    }
}

class student extends Task01{

    student(String cousrse){
        super("rahul");

        System.out.println("the coursee is " + cousrse);

    }

    public static void main(String[] args) {
        String cousrse = "JAVA";
        student stud = new student(cousrse);

    }
}
