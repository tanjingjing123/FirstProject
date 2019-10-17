import java.util.HashMap;
import java.util.Map;

public class IntersectionofTwoLinkedList
{
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA==null || headB==null)
        {
            return null;
        }
        Map<ListNode,Integer> map=new HashMap<>();
        ListNode tempA=headA;
        ListNode tempB=headB;

        while (tempA!=null)
        {
            map.put(tempA,tempA.val);
            tempA=tempA.next;
        }
        while (tempB!=null)
        {
            if (map.get(tempB)!=null)
            {
                return tempB;
            }
            tempB=tempB.next;
        }
        return null;
    }

    public static void main(String[] args)
    {
        ListNode headA=new ListNode(4);
        ListNode nodeA1=new ListNode(1);
        ListNode nodeA2=new ListNode(8);
        ListNode nodeA3=new ListNode(4);
        ListNode nodeA4=new ListNode(5);
        ListNode headB=new ListNode(5);
        ListNode nodeB1=new ListNode(0);
        ListNode nodeB2=new ListNode(1);
        ListNode nodeB3=new ListNode(6);

        headA.next=nodeA1;
        nodeA1.next=nodeA2;
        nodeA2.next=nodeA3;
        nodeA3.next=nodeA4;
        headB.next=nodeB1;
        nodeB1.next=nodeB2;
        nodeB2.next=nodeB3;
        nodeB3.next=nodeA2;
        ListNode res = getIntersectionNode(headA,headB);
        System.out.println(res);
    }
}
