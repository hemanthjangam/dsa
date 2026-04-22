package LinkedList;

import java.util.Scanner;

public class ReverseLL {
    static void main(String[] args) {
        class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
                this.next = null;
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the list ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the values of list ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        Node head = new Node(nums[0]);
        Node temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(nums[i]);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

        System.out.println("Reversed list");

        Node curr = head, prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node newHead = prev;

        while (newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
    }
}
