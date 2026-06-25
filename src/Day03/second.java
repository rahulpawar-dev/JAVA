package Day03;

class women{

    void work(){
        System.out.println( " women is working ");
    }

}

class Teacher extends women{
    @Override
    void work(){
        System.out.println( " Women is Teaching ");

    }

}

public class second {

    public static void main(String[] args) {
        women w = new women();
        Teacher t = new Teacher();
        t.work();
    }


}
