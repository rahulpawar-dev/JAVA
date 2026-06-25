package Day04;


class BoilWater extends Thread{

    Thread th = new Thread();
    public void run(){


        System.out.println( "Boiling Water" );
        try {
            th.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Water is ready ");
    }



}




class BoilMilk extends  Thread{

    Thread th = new Thread();
    public void run(){
        System.out.println("Boiling Milk");

        try {
            th.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Milk is Ready");
    }


}



class GrindCoffee extends Thread{

    Thread th = new Thread();
    public void run(){
        System.out.println( " Grinding Coffee");

        try {
            th.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Coffee is Ready");
    }
}




public class Coffeemachine{
    public static void main(String[] args) {


        BoilWater bl = new BoilWater();
        BoilMilk bl1 = new BoilMilk();
        GrindCoffee g = new GrindCoffee();

        Coffeemachine cf = new Coffeemachine();

        bl.start();
        bl1.start();
        g.start();




    }
}
