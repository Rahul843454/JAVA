package Challenge82;

public class ArrayOperations {
    
    private int[] num;

    
    public ArrayOperations(int[] num) {
        this.num = num;
    }


    public class Statistics{

        double mean(){
            long sum = 0;
            for (int n : num) {
                sum +=n;
            }
            return sum/num.length ;
        }

        double median(){
            return 0;
        }
    }
}
