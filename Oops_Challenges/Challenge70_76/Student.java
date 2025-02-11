package Challenge70_76;

public class Student {
    String name;
    int age;
    int rollno;
    String course;

    public Student(String name, int age, int rollno, String course) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student Details: [Name:"+ name +", Age:"+age+ ", Roll Number:"+rollno+", Course:"+course +"]";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sahil", 21 ,15,"B.tech");
        System.out.println(s1);
    }
}
