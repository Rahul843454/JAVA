package TernaryAndSwitch;

import java.util.Scanner;

public class MonthsUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month Number: ");
        int mNum = input.nextInt();
        String monthIs = getMonthName(mNum);
        System.out.println("Month is " + monthIs);
        
        input.close();
    }

    // Functionn to know month using Switch

    public static String getMonthName(int mNum){
        return switch(mNum){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        }; 
    }
}
