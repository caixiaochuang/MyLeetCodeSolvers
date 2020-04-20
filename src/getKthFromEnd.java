public class getKthFromEnd {

    public static ListNode getKthFromEnd(ListNode head, int k) {

        int listcount = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            listcount++;
            temp=temp.next;
        }
        while ((listcount-k)>0){
            head = head.next;
            listcount--;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head0 = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        ListNode head5 = new ListNode(6);
        ListNode head6 = new ListNode(7);
        head0.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = null;
        //1->2->3->4->5->6->7
        System.out.println(getKthFromEnd(head0, 2));
    }


}
