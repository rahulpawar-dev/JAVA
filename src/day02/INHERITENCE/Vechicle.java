package day02.INHERITENCE;

public class Vechicle {


    Vechicle(String Brand){
        System.out.println("the Brand Name = "+Brand);


    }
}

class car extends Vechicle {

    car(String model) {
        super("Tesala");

        System.out.println("the Model is "+ model);
    }

    public static void main(String[] args) {

        String Model = "2015";
        car obj = new car(Model);
    }
}
