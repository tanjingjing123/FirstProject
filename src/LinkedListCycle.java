import java.util.HashSet;

public class LinkedListCycle
{
    public static boolean hasCycle(ListNode head)
    {
        ListNode firstPointer=head;
        ListNode secondPointer=head;
        while(secondPointer!=null && secondPointer.next!=null){
            firstPointer=firstPointer.next;
            secondPointer=secondPointer.next.next;

            if (firstPointer==secondPointer)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        ListNode head=new ListNode(3);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(5);
        ListNode node3=new ListNode(7);
        ListNode node4=new ListNode(0);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(2);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node1;
        boolean res = hasCycle(head);
        System.out.println(res);
    }
}
