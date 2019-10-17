import java.util.Stack;

public class MinimumabsolutediffBST
{
    static int min=Integer.MAX_VALUE;
    static TreeNode prev=null;
    public static int getMinimumDiff(TreeNode root)
    {
        if (root==null) return min;
        getMinimumDiff(root.left);
        if (prev!=null){
            if (root.val-prev.val<min){
                min=root.val-prev.val;
            }
        }
        prev=root;
        getMinimumDiff(root.right);
        return min;

    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(5);
        root.left.right=new TreeNode(7);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.left.left=new TreeNode(9);
        root.right.left.right=new TreeNode(18);
        root.right.right=new TreeNode(25);
        root.left.left=new TreeNode(2);
        root.left.left.left=new TreeNode(0);
        root.left.left.right=new TreeNode(4);
        int res=getMinimumDiff(root);
        System.out.println(res);
    }
}
