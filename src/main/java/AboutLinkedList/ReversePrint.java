package AboutLinkedList;

/*剑指offer第6题：从尾到头打印链表*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) { this.val = x; }
    ListNode(int x, ListNode next) { this.val = x; this.next = next; }
}

public class ReversePrint {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(2, null)));
        Solution1 s = new Solution1();
        System.out.println(Arrays.toString(s.ReversePrint1(head)));
        System.out.println(Arrays.toString(s.ReversePrint2(head)));
    }
}

class Solution1 {
    // 递归法，时间复杂度O(N)，空间复杂度O(N)
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] ReversePrint1(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    private void recur(ListNode head) {
        if (head == null) {
            return;
        }
        recur(head.next);
        tmp.add(head.val);
    }

    // 栈，时间复杂度O(N)，空间复杂度O(N)
    public int[] ReversePrint2(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
