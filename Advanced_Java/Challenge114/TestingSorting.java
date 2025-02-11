package Challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
            new Employee("Sahil",6500),
            new Employee("Gunjan", 210),
            new Employee("Abhijeet", 4510),
            new Employee("Agaj", 1150),
            new Employee("Ravi", 2110)
        );

        emp.stream()
            .sorted((emp1,emp2)-> emp1.getSalary() - emp2.getSalary())
            .forEach(System.out::println);
    }
}
