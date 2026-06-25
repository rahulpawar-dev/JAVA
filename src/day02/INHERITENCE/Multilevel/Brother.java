package day02.INHERITENCE.Multilevel;


class parent
{
    public void house(){
        System.out.println(" 2BHK");
    }

}

class sister extends parent{

}

public class Brother extends parent{
    public static void main(String[] args) {
        Brother obj = new Brother();
        sister obj1 = new sister();
        obj1.house();
        obj.house();
    }
}
