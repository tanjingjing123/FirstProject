public class mergeTwoLists
{
    public static ListNode mergetwoLists(ListNode list1,ListNode list2)
    {
        if (list1==null){
            return list2;
        }else if (list2==null){
            return list1;
        }

        ListNode mergedHead=null;

        if (list1.val<list2.val){
            mergedHead=list1;
            mergedHead.next=mergetwoLists(list1.next,list2);
        }else {
            mergedHead=list2;
            mergedHead.next=mergetwoLists(list1,list2.next);
        }
        return mergedHead;
    }

    public static void main(String[] args)
    {
        ListNode listA=new ListNode(1);
        ListNode listA1=new ListNode(2);
        ListNode listA2=new ListNode(4);
        ListNode listA3=new ListNode(6);
        ListNode listA4=new ListNode(8);
        ListNode listB=new ListNode(2);
        ListNode listB1=new ListNode(3);
        ListNode listB2=new ListNode(5);
        ListNode listB3=new ListNode(5);
        ListNode listB4=new ListNode(7);

        listA.next=listA1;
        listA1.next=listA2;
        listA2.next=listA3;
        listA3.next=listA4;
        listA4.next=null;
        listB.next=listB1;
        listB1.next=listB2;
        listB2.next=listB3;
        listB3.next=listB4;
        listB4.next=null;
        ListNode res = mergetwoLists(listA,listB);
        System.out.println(res);
    }
}
