public class FixedArrays {
    public static void main(String[] args) {
        String[] fruits = { "banana", "pear", "papaya", "kiwi" };
        String temp = fruits[0];

        fruits[0] = fruits[3];
        fruits[3] = temp;

        System.out.println(fruits.length);
        System.out.println(fruits[fruits.length - 1]);

        int[] numbers = {2, 4, 12, 7, 23, 44, 5, 9, 7, 11, 10, 3};

        System.out.println(numbers[0] + numbers[3]); // 9

        System.out.println(numbers[2] + numbers[5]); // 56

        System.out.println(numbers[2] * 2); // 24

        System.out.println(numbers[10] * 10); // 100
    }
}