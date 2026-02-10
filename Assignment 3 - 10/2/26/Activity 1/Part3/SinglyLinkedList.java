package COLLECT;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MySinglyLinkedList {
    Node head;

    void insertBegin(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void insertEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null)
            t = t.next;
        t.next = n;
    }

    void trav() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    void search(int key) {
        Node t = head;
        while (t != null) {
            if (t.data == key) 
            	{System.out.println(key+" is present");
            	return;}
            t = t.next;
        }
        System.out.println(key+" is not present");
    }
    

  
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySinglyLinkedList l=new MySinglyLinkedList();
		l.insertBegin(5);
		l.insertEnd(14);
		l.insertBegin(17);
		l.insertBegin(8);
		l.search(5);
		l.trav();
		

	}

}
