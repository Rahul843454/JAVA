import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pencil price: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter Pen price: ");
        float pen = sc.nextFloat();
        System.out.print("Enter Eraser price: ");
        float eraser = sc.nextFloat();

        float totalPrice = pencil + pen + eraser;
        float  gst = (float)18/100 *(totalPrice);
        float finalPrice = totalPrice + gst;

        System.out.println();
        System.out.println("Bill");
        System.out.println("Price of items: "+ totalPrice);
        System.out.println("GST: "+gst);
        System.out.println("Total: "+finalPrice);
    }
}
