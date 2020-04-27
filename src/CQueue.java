import java.util.Stack;

class CQueue {

    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */

    private Stack<Integer> queue;
    private Stack<Integer> buckert;

    public CQueue() {
        this.buckert = new Stack<>();
        this.queue = new Stack<>();
    }

    public void appendTail(int value) {

        while(!queue.isEmpty())
            buckert.push(queue.pop());

        queue.push(value);

        while (!buckert.isEmpty())
            queue.push(buckert.pop());


    }

    public int deleteHead() {

        if(queue.size()==0) return -1;
        return queue.pop();
    }
}