package Day05;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {


//        the LInkedHashset used to store value in prserved order
//        but the OnlyHashSet dosn't store value of HashSet in preserved Order
//        HashSet<Integer> in = new HashSet<>();


         LinkedHashSet<String> Hs = new LinkedHashSet<>();

        Hs.add("Rahul");
        Hs.add("Rishab");
        Hs.add("Rohit");
        Hs.add("Ram");
        Hs.add("Rameshwar");
        Hs.add("Raghunath");
        Hs.add("Rahul");


        System.out.println(Hs);



    }
}
