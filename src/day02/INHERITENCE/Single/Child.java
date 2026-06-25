package day02.INHERITENCE.Single;

import java.util.Date;

class DAD{
    public void car(){
        System.out.println("this is car ");
    }


    DAD(int a){
        System.out.println("this is parent Construcotr " +a);
    }

}


public class Child extends DAD {

    Child(int a){
        super(10);

        System.out.println("the child constructor is executed " + a);


    }
    public static void main(String[] args) {
        Child obj = new Child(10);

        obj.car();

    }
}


