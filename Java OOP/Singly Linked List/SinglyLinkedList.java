public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("Lists is empty, nothing to remove");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node runner = head;

        while (runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public void printValues() {
        Node runner = head;
        while (runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public Node find(int value) {
        Node runner = head;
        while (runner != null) {
            if (runner.value == value) {
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }
        if (head == null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node runner = head;
        int count = 0;
        while (runner != null && count < index - 1) {
            runner = runner.next;
            count++;
        }
        if (runner == null || runner.next == null) {
            System.out.println("Index out of bounds, nothing to remove.");
            return;
        }
        runner.next = runner.next.next;
    }
}
