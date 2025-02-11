package Challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the path of the file: ");
        String fileName = input.next();

        try(FileReader r = new FileReader(fileName)){

            int read = 0;
            do{
                read = r.read();
                System.out.print((char)read);
            }while(read != -1);

        }catch(FileNotFoundException e){
            System.out.printf("Exception Occured: %s",e.getMessage());
        }catch(IOException e){
            System.out.printf("Exception Occured: %s",e.getMessage());
        }
        input.close();
    }
}
