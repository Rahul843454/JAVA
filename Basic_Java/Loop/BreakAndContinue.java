package Loop;
public class BreakAndContinue {
    public static void main(String[] args) {
       
        
        //Testing break it will print 1 to 10 only
        System.out.println("Before loop");
        for(int i=1; i<1000000000; i++){
            if(i == 11){
                // end all the remaining part and exit from the loop, when there is break. 
                break;
            }
            System.out.println(i);
        }
        System.out.println("After loop\n");


        //Testing Continue it will skip 5 and print all other numbers
        System.out.println("Before loop");
        for(int i=1; i<10; i++){
            if(i == 5){
                // continue will skip below code and loop start checking condition after updation of i
                continue;
            }
            System.out.println(i);
        }
        System.out.println("After loop");
    }
}
