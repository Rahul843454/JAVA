
package Challenge70_76;
public class StringConcatination {
   public static void main(String[] args) {
   String hlo = "hello ";
    String name = "Sahil, ";
    String greeting = "How was your day?";
   
   String msg = hlo.concat(name.concat(greeting));
   System.out.println(msg.toUpperCase());
   //  System.out.printf("Hello %S, %S.",name,greeting);
   }
}
