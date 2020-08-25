package OJ题;

/**
 * @Author Meng Xin
 * @Date 2020/8/25 7:13
 */
public class 公共链表节点 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            if (pHead1 == null || pHead2 == null) {
                return null;
            }
            ListNode p1 = pHead1;
            ListNode p2 = pHead2;
            while (p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
                if (p1 != p2) {
                    if (p1 == null) {
                        p1 = pHead2;
                    }
                    if (p2 == null) {
                        p2 = pHead1;
                    }
                }
            }
            return p1;
        }


        public ListNode ReverseList(ListNode head) {
            ListNode pre = null;//前
            ListNode next = null;//后
            while (head != null) {
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }
}
