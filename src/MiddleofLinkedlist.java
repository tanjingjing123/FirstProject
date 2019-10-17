public class MiddleofLinkedlist
{
    public static ListNode middleNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args)
    {
        ListNode head=new ListNode(1);
        ListNode listA1=new ListNode(2);
        ListNode listA2=new ListNode(3);
        ListNode listA3=new ListNode(4);
        ListNode listA4=new ListNode(5);
        ListNode listA5=new ListNode(6);

        head.next=listA1;
        listA1.next=listA2;
        listA2.next=listA3;
        listA3.next=listA4;
        listA4.next=listA5;
        listA5.next=null;
        ListNode res= middleNode(head);
        System.out.println(res);
    }
}

