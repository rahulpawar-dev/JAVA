package day02;

public class first {
    first(){
        System.out.println("this is constructor 0 ");
    }
    first(int a){
        System.out.println("ur Roll Number "+a);
    }
    first(String name ){
        System.out.println("ur name "+name);
    }

    public static void main(String[] args) {
        System.out.println("Day 02");

//        constructor in java
        first obj = new first();
        first obj1 = new first("rahul");
        first obj2 = new first(56);





    }
}
