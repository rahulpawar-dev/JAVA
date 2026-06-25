package day02;

public class Task04 {
    int FindLarge(int a , int b){
        if (a>b){
            System.out.println("the a is a largest"+  a );

        }
        else if (b>a){
            System.out.println("the b is largest"+ b);
        }
        else {
            System.out.println("the both are same ");
        }

        return 0;

    }

    public static void main(String[] args) {

        Task04 obj = new Task04();
        obj.FindLarge(10 , 20);

    }
}
