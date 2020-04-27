import java.util.Stack;

class MyQueue {


    /**
    * Your MyQueue object will be instantiated and called as such:
    * MyQueue obj = new MyQueue();
    * obj.push(x);
    * int param_2 = obj.pop();
    * int param_3 = obj.peek();
    * boolean param_4 = obj.empty();
    */
    /** Initialize your data structure here. */

    private Stack<Integer> queue = new Stack<>();
    private Stack<Integer> buckert = new Stack<>();

    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        while(!queue.isEmpty())
            buckert.push(queue.pop());

        queue.push(x);

        while (!buckert.isEmpty())
            queue.push(buckert.pop());
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        return queue.pop();

    }

    /** Get the front element. */
    public int peek() {

        return queue.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
