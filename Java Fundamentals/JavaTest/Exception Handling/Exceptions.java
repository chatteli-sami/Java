public class Exceptions {
    public static void main(String[] args) {
        int[] numbers = { 50, 10, 50, 0, 2, 0, 457652554 };

        for (int num : numbers) {
            try {
                int quoteint = 100 / num;
                System.out.println("100 /  " + num + " = " + quoteint);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
}
