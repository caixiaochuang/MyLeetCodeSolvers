public class kthToLast {

    public int kthToLast(ListNode head, int k) {

        ListNode temp = head;
        while (k>0)
        {
            temp = temp.next;
            k--;
        }

        while(temp!=null){
            head = head.next;
            temp = temp.next;
        }

        return head.val;
    }
}
