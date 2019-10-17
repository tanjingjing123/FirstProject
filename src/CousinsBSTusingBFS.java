import java.util.LinkedList;
import java.util.Queue;

public class CousinsBSTusingBFS
{
    public static boolean isCousins(TreeNode root, int x, int y)
    {
        if (root==null)
            return false;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode xParent=null,yParent=null;
            int size=queue.size();
            for (int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                TreeNode left=node.left;
                TreeNode right=node.right;
                if (left!=null){
                    if (left.val==x)
                        xParent=node;
                    else if (left.val==y)
                        yParent=node;
                    queue.add(left);
                }
                if (right!=null){
                    if (right.val==x)
                        xParent=node;
                    else if (right.val==y)
                        yParent=node;
                    queue.add(right);
                }
                if (xParent!=null && yParent!=null)
                    return xParent!=yParent;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(5);
        root.right=new TreeNode(12);
        root.right.left=new TreeNode(10);
        root.right.left.left=new TreeNode(9);
        root.right.left.right=new TreeNode(11);
        root.right.right=new TreeNode(15);
        root.right.right=new TreeNode(15);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(7);
        root.left.right.left=new TreeNode(6);
        root.left.left.left=new TreeNode(0);
        root.left.left.right=new TreeNode(4);
        boolean res=isCousins(root,2,10);
        System.out.println(res);
    }
}
