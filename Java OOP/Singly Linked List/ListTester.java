public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);

        sll.remove();
        sll.remove();

        System.out.println("List after two removals:");
        sll.printValues();

        Node foundNode = sll.find(10);
        if (foundNode != null) {
            System.out.println("Found node with value: " + foundNode.value);
        } else {
            System.out.println("Node with value 10 not found.");
        }

        sll.removeAt(1);
        System.out.println("List after removeAt(1):");
        sll.printValues();
    }
}
