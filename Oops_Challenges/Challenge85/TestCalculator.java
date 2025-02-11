package Challenge85;

public class TestCalculator extends Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10,20);
        calc.add(10, 20, 30);
        calc.add(10, 20, 30, 40);
        calc.add(1876530.5097654345, 275430.976543);
    }
}
