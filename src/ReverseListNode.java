import java.util.ListIterator;

public class ReverseListNode
{
    public static ListNode removeElements(ListNode head,int val)
    {
        ListNode first=head;
        ListNode sec=null;
        while(first!=null)
        {
            if (first.val==val)
            {
                if (sec==null){
                    first=head.next;
                    head=first;
                }else {
                    sec.next=first.next;
                    first=first.next;
                }
            }else {
                sec=first;
                first=first.next;
            }
        }
        return head;

    }

    public static void main(String[] args)
    {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(6);
        ListNode node4=new ListNode(3);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(5);
        ListNode node7=new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=null;
        ListNode head = removeElements(node1,6);
        System.out.println(head.next.next.val);
    }
}
