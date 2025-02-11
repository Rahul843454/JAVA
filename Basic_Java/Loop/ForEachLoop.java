package Loop;
public class ForEachLoop {
    public static void main(String[] args) {
        
        String[] arr = new String[] {
            "Sahil", "Patel", "Agaj", "Alam", "Abhijeet", "Kumar", "Ravi", "Ishwar", "Rahul", "Singh"
        };
        
        // For Each loop to iterate each elements in the array

        for(String name : arr){
            System.out.println(name);
        }
    }
}
