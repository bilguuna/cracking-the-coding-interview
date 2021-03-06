package bilguun.ariunbold.solutions.chapter2;

public class Utils {
    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.getValue().toString());
            System.out.print(" -> ");
            node = node.getNext();
        }

        System.out.print("NULL");
        System.out.println("");
    }

    public static Node initLinkedList(int n) {
        Node<Integer> r = new Node<>(1, null);
        Node<Integer> currNode = r;

        for (int i = 2; i <= n; i++) {
            Node<Integer> node = new Node<>(i, null);
            currNode.setNext(node);
            currNode = node;
        }
        return r;
    }

    public static int lengthOfLinkedList(Node node) {
        int r = 0;

        while (node != null) {
            r++;
            node = node.getNext();
        }

        return r;
    }
}
