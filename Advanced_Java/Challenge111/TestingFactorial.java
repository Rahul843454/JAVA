package Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial using Structural Programming and Functional Programming");
        int num = 5;
        System.out.println(factorial(num));

        // Instream is use to create stream of int, here it will create a stream between 1 and num.
        IntStream.rangeClosed(1, num)
                    .reduce((a,b) -> a*b)
                    .ifPresent(System.out::println);
    }

    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int fact = 1;
        for(int i= 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
}
