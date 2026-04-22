package LinkedList;

import java.util.Scanner;

public class MiddleOfALL {

    static void main(String[] args) {
        class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of LL ");
        int n = in.nextInt();
        System.out.println("Enter values of LL ");
        int[] nums = new int[n];
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
            System.out.print(temp.value);
            temp = temp.next;
        }

        Node slow = head, fast = head;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.value);
    }
}
