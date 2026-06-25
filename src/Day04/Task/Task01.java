package Day04.Task;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Kandhar");
        cities.add("Nanded");
        cities.add("Purna");
        cities.add("Nagpur");
        cities.add("Mumbai");

        System.out.println(cities.stream().count());

    }



}
