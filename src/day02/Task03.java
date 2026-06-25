package day02;

public class Task03 {

    Task03(String Ename){
        System.out.println("the Name of Employee = "+Ename);

    }
    Task03(String Ename , int Sallary){
        System.out.println("the Employee Name " + Ename);
        System.out.println("sallary of Employee" +Sallary);

    }
    Task03(){
        System.out.println("default Constructor ");

    }

    public static void main(String[] args) {
        Task03 obj = new Task03("rahul");
        Task03 obj1 = new Task03("rahul",230000);
        Task03 obj2 = new Task03();
    }
}
