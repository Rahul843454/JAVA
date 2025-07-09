package OOPs;

public class LearningConstructor {


    public static void main(String[] args) {
//        Complex num1 = new Complex();
        Complex num2 = new Complex(3);
        Complex num3 = new Complex(5,6);
//        num1.print();
        num2.print();
        num3.print();

        System.out.println("Adding Two Complex Numbers");
        Complex result = num2.add(num3);
        result.print();
        System.out.println(num2);

    }
}

class Complex{
    int a,b;

//    Complex(){
//        a = 0;
//        b = 7;
//    }

    Complex(int real){
        a = real;
        b =0;
    }

    Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num2){
        System.out.println(this);
        this.print();
        num2.print();
        return  new Complex(a+num2.a , b+num2.b);
    }
}