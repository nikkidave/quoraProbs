// Java program for reversing the Linked list

class Main {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverseList(Node curr, Node prev) {

        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return null;
        }
        Node next1 = curr.next;
        curr.next = prev;
        reverseList(next1, curr);
        return head;
    }


    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original Linked list ");
        list.printList(head);
        Node res = list.reverseList(head, null);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(res);
    }
}
