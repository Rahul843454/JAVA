package Challenge_59_69;

import java.util.Scanner;

public class TableUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for its Table: ");
        int num = input.nextInt();
        TableOf(num);

        input.close();
    }
    public static void TableOf(int a){
        int res = 0;
        for(int i=1;i<=10;i++){
            res = i*a;
            System.out.println(a +" X " + i +" = "+ res);
        }
    }
}
