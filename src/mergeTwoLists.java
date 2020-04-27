public class mergeTwoLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode demyHead = new ListNode(-1);
        ListNode temp = demyHead;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            } else {
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }

        }
        if(l1!=null)
            temp.next=l1;
         else
             temp.next =l2;
        return demyHead.next;
    }
}
