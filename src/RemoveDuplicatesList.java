public class RemoveDuplicatesList
{
    public static ListNode deleteDuplicatesSortedList(ListNode head)
    {
        ListNode current=head;

        while(current!=null&&current.next!=null)
        {
            if (current.val==current.next.val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return head;
    }

    public static void main(String[] args)
    {
        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(4);
        ListNode node6=new ListNode(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=null;
        ListNode res = deleteDuplicatesSortedList(head);
        System.out.println(head.next.next.val);
    }
}
