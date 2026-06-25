package Day03.Task;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int  salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {


        Employee e = new Employee();
        e.setEmployeeId(1);
        e.setEmployeeName("rahul");
        e.setSalary(300000);

        System.out.println("Employee Id = " + e.getEmployeeId());

        System.out.println(" Employee Syllary= "+ e.getSalary());
        System.out.println("Employee Name = "+ e.getEmployeeName());
    }




}
