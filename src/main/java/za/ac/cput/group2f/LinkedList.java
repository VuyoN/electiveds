class Node<T> {
    // data cell, i.e. car
    public T car;

    // pointer or next cell, i.e. cdr
    public Node cdr;

    public Node(T car) {
        this.car = car;
    }
}

class LinkedList<T> {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void cons(T car) {
        Node<T> node = new Node<T>(car);
        node.cdr = this.head;
        this.head = node;
    }

    public void reverse() {
        // select the current node
        Node cur = this.head;

        // reset the head to null
        this.head = null;

        while (cur != null) {
            // select the next node
            Node next = cur.cdr;

            // set the current node's next to the head
            cur.cdr = this.head;

            // set the head to the current node
            this.head = cur;

            // set the current node to the next node
            cur = next;
        }
    }

    public Node nth(int n) {
        Node p = this.head;
        for (int i = 0; i < n; i++) {
            if (p == null) {
                return p;
            }

            p = p.cdr;
        }

        return p;
    }
}
