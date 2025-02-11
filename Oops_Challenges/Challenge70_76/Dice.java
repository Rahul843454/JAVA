package Challenge70_76;

public class Dice {

    int random;
    
    int roll(){
        random =(int) Math.ceil(Math.random()*6);
        return random;
    }
    public static void main(String[] args) {
        Dice d1 = new Dice();
        System.out.println("You got: "+d1.roll());
    }
}
