import java.util.LinkedList;

class MyStack {
   private  LinkedList<Integer> queue;

    public MyStack() {
        queue =new LinkedList<Integer>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        LinkedList<Integer> queue2=new LinkedList<Integer>();//声明辅助队列
        int count=0;
        while(true){
            count+=1;
            queue2.add(queue.poll());
            if(queue.isEmpty())
                break;
        }
        int res=0;
        for(int i=0;i<count-1;i++){
            queue.add(queue2.poll());
        }
        res=queue2.peek();
        return res;
    }

    public int top() {//类似pop()，比pop少一个while循环，只用记录最后一个元素即可
        LinkedList<Integer> queue2=new LinkedList<Integer>();
        int res;
        while(true){
            res= queue.peek();
            queue2.add(queue.poll());
            if(queue.isEmpty())
                break;
        }
        queue =queue2;
        return res;
    }

    public boolean empty() {
        if(queue.isEmpty())
            return true;
        return false;
    }
}


