package Day03;

public class first {
//    polymorphism in java

//    method overloading

    public void ft(int a ,int b){
        System.out.println(a+b);

    }
    public void ft(int a ,int b, int c){
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        first f = new first();

        f.ft(20,30,40);
        f.ft(20,20);

    }

}
