public class C52Course {
    static int maxCapacity = 30;
    String courseName;
    int enrollments;

    String[] enrolledStudents = new String[maxCapacity];

    // constructor
    C52Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }


    static void setMaxCapacity(int capacity){
            C52Course.maxCapacity = capacity;
    }

    void enrolledStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " is Enrolled in the Course");
    }

    void unenrollStudent(String studentName){

        int count = 0;
        
        for(int i=0 ; i<this.enrolledStudents.length; i++){
           if(studentName == enrolledStudents[i]){
               count+=1;
           }
       }
       
        int nsize = this.enrolledStudents.length - count;
        String[] newArr = new String[nsize];
        int i=0,j=0;
        for(i=0; i<this.enrolledStudents.length;i++){
            if(enrolledStudents[i] != studentName){
                newArr[j] = this.enrolledStudents[i];
                j++;
            }
        }

        // to update newArr to enrolledstudent[] list
        for(i=0;i<newArr.length;i++){
            for(j=0;j<newArr.length;j++){
                enrolledStudents[i] = newArr[j];
            }
        }

        System.out.println( studentName + " is Removed");
    }

    public static void main(String[] args) {
        C52Course c1 = new C52Course("DSA");
        C52Course.setMaxCapacity(50);
        c1.enrolledStudent("Sahil");
        c1.enrolledStudent("Patel");
        c1.unenrollStudent("Patel");
    }
}
