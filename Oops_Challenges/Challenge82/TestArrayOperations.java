package Challenge82;

public class TestArrayOperations {
  public static void main(String[] args) {
    ArrayOperations arr = new ArrayOperations(new int[] {1,2,3,4,5,6});
    ArrayOperations.Statistics st = arr.new Statistics();
    System.out.println( "Mean of all elements in Array = "+ (int)st.mean());
  }
}
 