package COLLECT;

public class LinkyAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListAct2 list = new SinglyLinkedListAct2();

        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(40, 4);

        list.traverse();

        list.deleteByValue(20);
        list.traverse();

        System.out.println("Total Nodes: " + list.countNodes());
        System.out.println("Middle Element: " + list.findMiddle());

        list.reverse();
        System.out.println("After Reversal:");
        list.traverse();

	}

}
class SinglyLinkedListAct2 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    int findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


    void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
}