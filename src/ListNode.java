public class ListNode {

     int val;
     ListNode next;
     public ListNode(int x)
     {
         val = x;
     }

    @Override
    public String toString() {
         StringBuilder sb  = new StringBuilder();
         if(this.next == null)
             sb.append(val + "->null");
         else
             sb.append(val +"->" + next);
        return sb.toString();
    }
}
