public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 3);
        System.out.println(result);
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int divide(int x, int y) {
        return x / y;
    }
}
