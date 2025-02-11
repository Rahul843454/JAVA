import java.util.Scanner;
public class c17greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number to check which is largest one: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // To check largest
        if(a>b && a>c){
            System.out.println(a +" is largest");
        }else if(b>a && b>c){
            System.out.println(b +" is largest");
        }else{
            System.out.println(c +" is largest");
        }
        input.close(); //to prevent resource leak
    }
}
