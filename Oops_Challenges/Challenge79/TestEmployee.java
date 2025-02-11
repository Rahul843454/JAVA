package Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sahil Patel", 21, 25000);

        //Print details of employee using geetter
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());

        // Update/Change details using setter
        e1.setName("Sahil");
        e1.setAge(22);
        e1.setSalary(50000);

        
        //Print details of employee after changing  using geetter
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());

        //Testing getEmployeeDetails method declared in Employee class
        System.out.println(e1.getEmployeeDetails());
    }
}
