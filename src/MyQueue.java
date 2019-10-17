import java.util.Stack;

public class MyQueue
{
    Stack<Integer> filo;
    Stack<Integer> fifo;

    public MyQueue()
    {
        this.filo=new Stack<>();
        this.fifo=new Stack<>();
    }

    public void push(int x)
    {
        filo.push(x);
    }

    public int pop()
    {
        if (fifo.isEmpty()){
            while (!filo.isEmpty()){
                fifo.push(filo.pop());
            }
        }
        return fifo.pop();
    }

    public int peek()
    {
        if (fifo.isEmpty()){
            while (!filo.isEmpty()){
                fifo.push(filo.pop());
            }
        }
        return fifo.peek();
    }

    public boolean empty(){
        return filo.isEmpty()&&fifo.isEmpty();
    }

    public static void main(String[] args)
    {
        Queue q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
