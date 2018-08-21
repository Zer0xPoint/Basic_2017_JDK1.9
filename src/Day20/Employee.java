package Day20;

import java.util.*;
import java.util.stream.Stream;

public class Employee {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() &&
                getSalary() == employee.getSalary() &&
                Objects.equals(getName(), employee.getName()) &&
                Objects.equals(getSex(), employee.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge(), getSalary());
    }

    private String name, sex;
    private int age,salary;

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String name, String sex, int age, int salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work() {
        System.out.println(this.name + "work" );
    }
}

class Tools {
    public static void arrayListFor(List<Employee> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Employee employee = arrayList.get(i);
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
            System.out.println(employee.getAge());
        }
    }

    public static void arrayListForeach(List<Employee> arrayList) {
        for (Object o : arrayList) {
            Employee employee = (Employee) o;
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
            System.out.println(employee.getAge());
        }
    }

    public static void arrayListIter(List<Employee> arrayList) {
        Iterator<Employee> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
            System.out.println(employee.getAge());
        }
    }

    public static void arrayListStream(List<Employee> arrayList) {
        Stream stream = arrayList.parallelStream();
        stream.forEach(o -> {
            Employee employee = (Employee) o;
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
            System.out.println(employee.getAge());
        });
    }


}

class EmployeeTestDrive {

    public static void main(String[] args) {
//        showInfo();
        addEmployee();
    }

    public static void addEmployee() {
        List<Employee> employees = new LinkedList<>() {
            {
                for (int i = 0; i < 3; i++) {
                    Employee employee = new Employee("name" + i,"male",i,i);
                    add(employee);
                }
            }
        };
        int index = 0;
        for (int i = 0; i < employees.size() - 1; i++) {
            Employee employee = employees.get(i);
            if (employee.getName().equals("name1")) {
                index = i;
                break;
            }
        }
        employees.add(index, new Employee("name","male",9,9));
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            System.out.println(employee.getSex());
            System.out.println(employee.getSalary());
            employee.work();
        }
    }

    public static void showInfo() {
        List<Employee> employees = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Employee employee = new Employee(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
            employees.add(employee);
            System.out.println("继续？y/n");
            Scanner scanner1 = new Scanner(System.in);
            if (scanner1.nextLine().equals("n")) {
                break;
            }
        }
        Tools.arrayListForeach(employees);
        Tools.arrayListFor(employees);
        Tools.arrayListIter(employees);
        Tools.arrayListStream(employees);
    }
}
