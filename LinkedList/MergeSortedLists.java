package LinkedList;

public class MergeSortedLists {
    static void main(String[] args) {
        class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
            }
        }

        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {2, 3, 4, 9, 20};

        Node head1 = new Node(nums1[0]);
        Node head2 = new Node(nums2[0]);

        Node temp1 = head1, temp2 = head2;

        for (int i = 1; i < nums1.length; i++) {
            temp1.next = new Node(nums1[i]);
            temp1 = temp1.next;
        }

        for (int i = 1; i < nums2.length; i++) {
            temp2.next = new Node(nums2[i]);
            temp2 = temp2.next;
        }
        temp1 = head1; temp2 = head2;

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.value <= temp2.value) {
                tail.next = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                temp2 = temp2.next;
            }
            tail = tail.next;
        }

        if (temp1 != null) tail.next = temp1;
        else tail.next = temp2;

        Node curr = dummy.next;

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }
}
