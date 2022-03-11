package leetcode.rotate_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return null;
        }

        int size = 1;
        ListNode counter = head;
        while (counter.next != null) {

            size++;
            counter = counter.next;
        }
        if (size == 1) return head;

        k = k % size;

        if (k == 0) return head;

        counter.next = head;

        ListNode newHead = head;
        int newTailPos = size - k;
        int i = 1;
        while (i < newTailPos) {
            head = head.next;
            i++;
        }

        newHead = head.next;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(new Solution().rotateRight(input, 2));
//        ListNode input = new ListNode(0, new ListNode(1, new ListNode(2)));
//
//        System.out.println(new Solution().rotateRight(input, 5));
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


