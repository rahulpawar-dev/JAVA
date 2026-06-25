package day02.Encapsulation;

public class student {

     private  String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public static void main(String[] args) {

        student s =new student();

        s.setName("rahul");
        s.setAge(21);
        System.out.println("the name of student  "+ (s.getName()));
        System.out.println("the age of student " + (s.getAge()));


    }
}
