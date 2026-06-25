package Day01;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
//        task1

//        chheck whether given code is even or odd


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the nuber to check wether given number is odd or even");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }

    }
}
