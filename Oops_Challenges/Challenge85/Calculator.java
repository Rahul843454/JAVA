package Challenge85;

class Calculator {
   
    protected void add(int a, int b){
        int sum = a+b;
        System.out.println("Sum = "+ sum);
    }

   protected void add(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Sum = "+ sum);
    }

    protected void add(int a, int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println("Sum = "+ sum);
    }

    protected void add(double a, double b){
        double sum = a+b;
        System.out.println("Sum = "+ sum);
    }

}
