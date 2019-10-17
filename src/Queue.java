import java.util.Scanner;

public class Queue<Item>
{
    private Node first;
    private Node last;
    private int N;

    private class Node
    {
        Item item;
        Node next;
    }

    public boolean isEmpty()
    {
        return first== null;
    }

    public int size()
    {
        return N;
    }

    public void enqueue(Item item)
    {
        Node oldlast = last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()) first=last;
        else          oldlast.next=last;
        N++;
    }

    public Item dequeue()
    {
         Item item=first.item;
         first=first.next;
         if(isEmpty()) last=null;
         N--;
         return item;
    }

    public static void main(String[] args)
    {
        Queue<String> q=new Queue<String>();
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(scanner.nextLine());

        while (in.hasNext())
        {
            String item=in.next();
            if(!item.equals("-"))
                q.enqueue(item);
            else if (!q.isEmpty())
                System.out.print(q.dequeue()+" ");
        }
        System.out.println("(" + q.size() + " left on queue)");
    }
}
