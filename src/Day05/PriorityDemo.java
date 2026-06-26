package Day05;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer>  pq =  new PriorityQueue<>();

        pq.add(10);
        pq.add(1);
        pq.add(15);
        pq.add(9);
        pq.add(122);
        pq.add(11);
        pq.add(19);
        pq.add(5);

        System.out.println(pq);





    }

}
