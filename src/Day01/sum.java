package Day01;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        Day01.sum of 1 to N

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();

        int sum = 0;
        for (int i  = 0 ; i<=n;){

            sum+=i;
            i++;


        }
        System.out.println("the sym of number = "+sum);



    }
}
