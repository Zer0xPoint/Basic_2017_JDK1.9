package Day16;

public class Employee {
    private String name, position;
    private int age;
    private double salary;

    public Employee(String name, String position, int age, double salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = (position.equals("售后服务") || position.equals("销售员")) ? position : "售后服务";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 18) ? age : 18;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        int salary = 0;
        if (this.age <= 20) {
            salary = 1000;
        } else if (this.age <= 25) {
            salary = 1500;
        } else if (this.age <= 30) {
            salary = 2000;
        } else if (this.age <= 40) {
            salary = 3000;
        } else if (this.age <= 50) {
            salary = 3500;
        } else {
            salary = 5000;
        }
        this.salary = salary;
    }

    public void show() {
        System.out.println(this.age + " " + this.position + " " + this.name + " " + this.salary);
    }
}

class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setAge(18);
        employee2.setAge(28);
        employee3.setAge(58);

        employee1.setName("lee");
        employee2.setName("lin");
        employee3.setName("wu");

        employee1.setPosition("售后服务");
        employee2.setPosition("销售员");
        employee3.setPosition("玩电脑");

        employee1.setSalary();
        employee2.setSalary();
        employee3.setSalary();

        employee1.show();
        employee2.show();
        employee3.show();
    }
}
