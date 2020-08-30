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
//            ListNode pre = null;//前
//            ListNode next = null;//后
//            while (head != null) {
//                next = head.next;
//                head.next = pre;
//                pre = head;
//                head = next;
//            }
//            return pre;

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

    //合并有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write code here
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newList = new ListNode(-1);
        ListNode cur = newList;
        while (cur1 != null || cur2.next != null) {
            if (cur1 == null) {
                newList.next = cur2;
                break;
            } else if (cur2 == null) {
                newList.next = cur1;
                break;
            }
            if (cur1.val <= cur2.val) {
                newList.next = cur1;
                cur1 = cur1.next;
            } else {
                newList.next = cur2;
                cur2 = cur2.next;
            }
            newList = newList.next;
        }
        return cur.next;
    }

    //判断链表是否有环
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    //找到环入口
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {                 //利用快慢指针找相遇点
                ListNode slow2 = head;    //设置以相同速度的新指针从起始位置出发
                while (slow2 != slow) {      //未相遇循环。
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

    //删除倒数节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        ListNode node = head;
        int len = 0;
        while (node != null) {
            node = node.next;
            len++;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head, pre = dummy;
        for (int i = 1; i <= len - n; i++) {
            pre = cur;//前一个保存
            cur = cur.next;//后一个
        }
        pre.next = cur.next;//前一个节点next指向后一个
        return dummy.next;
    }
}
