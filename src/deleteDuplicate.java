public class deleteDuplicate
{
    public static ListNode deleteDuplicate(ListNode head)
    {
        ListNode cur=head;

        while (cur!=null && cur.next!=null)
        {
            if (cur.val==cur.next.val)
            {
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args)
    {
        ListNode head=new ListNode(1);
        ListNode listA1=new ListNode(1);
        ListNode listA2=new ListNode(2);
        ListNode listA3=new ListNode(3);
        ListNode listA4=new ListNode(3);
        ListNode listA5=new ListNode(4);
        ListNode listA6=new ListNode(5);

        head.next=listA1;
        listA1.next=listA2;
        listA2.next=listA3;
        listA3.next=listA4;
        listA4.next=listA5;
        listA5.next=listA6;
        listA6.next=null;
        ListNode res= deleteDuplicate(head);
        System.out.println(res);
    }
}
