package ch02;

import java.util.ArrayList;

public class Employee {
    // Employ 클래스의 모든 인스턴스는 name, slary 변수 가짐
    private String name;
    private int id;
    private double salary;

    //인스턴스 메서드(instance method)라고 한다. 자바에서 static으로 선언하지 않은 메서드는 모두 인스턴스 메서드
    public void raiseSalary( double byPercent){
        double raise = salary * byPercent / 100;
        // raise 는 변수, salary는 인스턴스 변수
        this.salary += raise;
    }

    public String getName(){
        return name;
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    new Employee("James Bond", 500000);

    Employee james = new Employee("James Bond", 500000);

    ArrayList<Employee> staff = new ArrayList<>();
    staff.add(new Employee("James Bond", 500000));
}
