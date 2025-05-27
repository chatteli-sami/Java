class DoublyLinkedList {
    Node head;
    Node tail;

    public void printValuesbackward() {
        Node runner = tail;
        while (runner != null) {
            System.out.print(runner.value + " ");
            runner = runner.prev;
        }
        System.out.println();
    }

    public Node pop() {
        if (tail == null) {
            return null;
        }

        Node removed = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        removed.prev = null;
        return removed;
    }

    public boolean contains(Integer value) {
        Node runner = head;
        while (runner != null) {
            if (runner.value.equals(value)) {
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node runner = head;
        while (runner != null) {
            count++;
            runner = runner.next;
        }
        return count;
    }

    public void insertAt(Node newNode, int index) {
        if (index < 0 || newNode == null)
            return;

        if (index == 0) {
            newNode.next = head;
            if (head != null)
                head.prev = newNode;
            head = newNode;
            if (tail == null)
                tail = newNode;
            return;
        }

        Node runner = head;
        for (int i = 0; i < index - 1 && runner != null; i++) {
            runner = runner.next;
        }

        if (runner == null)
            return;
        newNode.next = runner.next;
        newNode.prev = runner;

        if (runner.next != null) {
            runner.next.prev = newNode;
        } else {
            tail = newNode;
        }

        runner.next = newNode;
    }

    public void removeAt(int index) {
        if (index < 0 || head == null)
            return;

        if (index == 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node runner = head;
        for (int i = 0; i < index && runner != null; i++) {
            runner = runner.next;
        }

        if (runner == null)
            return;

        if (runner.prev != null)
            runner.prev.next = runner.next;
        if (runner.next != null)
            runner.next.prev = runner.prev;
        if (runner == tail)
            tail = runner.prev;
    }

    public boolean isPalindrome() {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && left.prev != right) {
            if (!left.value.equals(right.value)) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public void add(Integer value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}
