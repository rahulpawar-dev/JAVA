package day02;

public class Task02 {
    int EvenOdd(int n){

        if(n%2==0){
            System.out.println("the number is even"+n);
        }
        else {
            System.out.println("the number is odd"+n);
        }

        return 0;
    }
    public static void main(String[] args) {
        int s =10;
        Task02 obj = new Task02();
        obj.EvenOdd(s);

    }
}
