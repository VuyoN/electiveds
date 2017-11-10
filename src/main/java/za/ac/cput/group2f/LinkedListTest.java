class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        assert list.isEmpty() == true;

        list.cons("foo");
        list.cons("bar");
        list.cons("baz");

        assert list.isEmpty() == false;

        assert list.head.car.equals("baz");
        assert list.head.cdr.car.equals("bar");
        assert list.head.cdr.cdr.car.equals("foo");

        list.reverse();

        assert list.head.car.equals("foo");
        assert list.head.cdr.car.equals("bar");
        assert list.head.cdr.cdr.car.equals("baz");

        assert list.nth(0).car.equals("foo");
        assert list.nth(1).car.equals("bar");
        assert list.nth(2).car.equals("baz");
        assert list.nth(3) == null;
    }
}