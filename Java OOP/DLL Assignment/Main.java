public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(2);
        dll.add(1);

        dll.printValuesbackward();

        System.out.println("Popped: " + dll.pop().value); // Popped: 1

        System.out.println("Contains 3? " + dll.contains(3)); // true
        System.out.println("Size: " + dll.size()); // 4

        dll.insertAt(new Node(99), 2);
        dll.removeAt(1);

        System.out.println("Is Palindrome? " + dll.isPalindrome()); // false
    }
}
