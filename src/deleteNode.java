import java.util.List;

public class deleteNode {

    public void deleteNode(ListNode node) {
        if(node!=null&&node.next!=null&&node.next.next==null) return ;//只有两个节点

        ListNode low = node;
        ListNode high = node;
        while(high.next!=null)
        {
            high = high.next.next;
            if(high.next==null){
                low.next = low.next.next;
                return ;
            }
            low = low.next;
        }


    }
}
