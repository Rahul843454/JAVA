package Challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }
            

        @Override
        public String toString() {
            return name + ": " + grade;
        }


        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
        
    }

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Sahil", 'A'));
        queue.offer(new Student("Abhijit", 'B'));
        queue.offer(new Student("Rahul", 'D'));
        queue.offer(new Student("Ravi", 'C'));
        queue.offer(new Student("Agaj", 'B'));
        queue.offer(new Student("Aman", 'Z'));

        System.out.println("Queue is: "+ queue);

        System.out.println("Got: " + queue.poll());
        System.out.println("Got: " + queue.poll());
        System.out.println("Got: " + queue.poll());
        System.out.println("Got: " + queue.poll());
        System.out.println("Got: " + queue.poll());
        System.out.println("Got: " + queue.poll());
    }
}
