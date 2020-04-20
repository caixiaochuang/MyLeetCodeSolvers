public class reverseList {

    public ListNode reverseList(ListNode head) {
        //思路：递归
        if (head == null || head.next == null) return head;
        //递归
        ListNode tail = reverseList(head.next);
        //翻转最后一个head
        head.next.next = head;
        //当前的头指向null
        head.next = null;
        return tail;
    }
}
