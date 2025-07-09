package OOPs;

public class mainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.balk();
        d1.walk();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();
        d2.balk();

    }
}


class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name +" is walking");
    }

    void balk(){
        System.out.println(name + " is balking");
    }
}

class Cat{

}