package day02.INHERITENCE.Multilevel;

class GrandFather{
    public void Plot(){
        System.out.println("this is plot from GrandFather");
    }
}


class Father extends GrandFather{
    public void car(){
        System.out.println("the Car is Gifted From Father");
    }

}


public class son extends Father {
    public static void main(String[] args) {

        System.out.println(" this is Rishab");
        son obj = new son();
        obj.Plot();
        obj.car();
    }
}
