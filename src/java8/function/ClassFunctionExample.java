package java8.function;

import java.util.function.Function;

class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

public class ClassFunctionExample {
    public static void main(String[] args) {
        Function<Employee, String> employeeToStringName = e -> e.getName();
        Employee emp = new Employee("veliuysal", 36);
        System.out.println(employeeToStringName.apply(emp));
    }
}
