package Day03;

interface ATM1{
    public void withdraw();
}
class axis implements ATM1{
    public void withdraw(){
        System.out.println(" Money Withdraw  successfully");
    }
}
public class interface1 {
    public static void main(String[] args) {

        axis x = new axis();
        x.withdraw();
    }
}
