
package Challenge70_76;
public class ImmutableClass {
    
    final String name;
    final String enrolledCourse;
    final int age;
    final long AadharNumber;
    final long MobileNumber;

    public ImmutableClass(String name, String enrolledCourse, int age, long AadharNumber, long MobileNumber) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
        this.age = age;
        this.AadharNumber = AadharNumber;
        this.MobileNumber = MobileNumber;
    }

    // @Override
    // public String toString() {
    //     return "Selected Student: [name=" + name + ", enrolledCourse=" + enrolledCourse + ", age=" + age
    //             + ", AadharNumber=" + AadharNumber +", Mobile number: "+MobileNumber+ "]";
    // }

    // public static void main(String[] args) {
    //     ImmutableClass s1 = new ImmutableClass("Sahil", "B.tech", 21, 219433024, 620023919);
    //     System.out.println(s1);
    // }
}
