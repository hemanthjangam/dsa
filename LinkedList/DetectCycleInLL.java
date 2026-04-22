package LinkedList;


import javax.xml.transform.Source;

public class DetectCycleInLL {
    static void main(String[] args) {
        class Node {
            int value;
            Node next;
            Node(int value) {
                this.value = value;
            }
        }

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Node head = new Node(nums[0]);
        Node temp = head;
        Node mid = null;

        for (int num : nums) {
            temp.next = new Node(num);
            if (num == 4) {
                mid = temp.next;
            }
            temp = temp.next;
        }
        temp.next = mid;

        Node slow = head, fast = head;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle detected at " + slow.value);
                return;
            }
        }
    }
}
