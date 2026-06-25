package Day03;


abstract class ATM{
    abstract void withdraw();
}


class HDFC extends ATM{
    @Override
    void withdraw() {
        System.out.println("Money Withdraw Successfully");
    }
}
public class Abstraction02 {

    public static void main(String[] args) {

        ATM  m = new HDFC();
        m.withdraw();


        }
    }

