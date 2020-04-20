public class reversePrint {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp!=null) {
            len++;
            temp = temp.next;
        }
        if(len == 0) return new int[]{};
        int res[] = new int[len];
        reversePrint(head,res ,len -1);
        return res;
    }

    public void reversePrint(ListNode head,int num[] ,int index) {
        if(head!= null){
            index = index-1;
            reversePrint(head.next,num,index);
            index++;
            System.out.println("index = "+ index+ "val = "+ head.val);
            num[index] =  head.val;
        }
    }
}
