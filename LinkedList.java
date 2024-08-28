public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void InsertAtFirst(int data) {
        // created new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void InsertAtLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void InsertAtPosition(int index, int data) {
        if (index == 0) {
            InsertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void PrintLinkedList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int DeleteAtFirst() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int DeleteAtLast() {
        if (size == 0) {
            System.out.println("list does not exist");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;

    }

    public int IterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int RecursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void DeleteFromLast(int n) {
        int sz = 0;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        int i = 1;
        int idxtoFind = sz - n;
        Node prev = head;
        while (i < idxtoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node FindMid(Node head) { // finding middle of the linked list using fast-slow process
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean CheckPlaindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node MidNode = FindMid(head);
        // reversing the second half
        Node prev = null;
        Node curr = MidNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; /*
                            * means that when the node would have reached curr=null the last element would
                            * have been the prev and on reversing the second half the prev would become the
                            * head of second half
                            */
        Node left = head;

        // checking if the left and right are equal
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.PrintLinkedList();
        ll.InsertAtFirst(1);
        // ll.PrintLinkedList();
        ll.InsertAtFirst(5);
        // ll.PrintLinkedList();
        ll.InsertAtPosition(1, 5);
        ll.InsertAtLast(5);
        // ll.PrintLinkedList();
        ll.InsertAtLast(1);
        // ll.PrintLinkedList();
        // ll.DeleteAtFirst();
        // ll.PrintLinkedList();
        // ll.DeleteAtLast();
        // ll.PrintLinkedList();
        // System.out.println(ll.IterativeSearch(100));
        // System.out.println(ll.RecursiveSearch(1));
        // ll.reverse();
        // ll.PrintLinkedList();
        // ll.DeleteFromLast(3);
        ll.PrintLinkedList();
        System.out.println(ll.CheckPlaindrome());

    }
}
