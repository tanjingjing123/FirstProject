public class MergeTwotrees
{
    public static TreeNode mergetrees(TreeNode t1,TreeNode t2)
    {
        if (t1==null && t2==null) return null;
        if (t1==null) return t2;
        if (t2==null) return t1;
        t2.val+=t1.val;
        t2.left=mergetrees(t1.left,t2.left);
        t2.right=mergetrees(t1.right,t2.right);
        return t2;
    }

    public static void main(String[] args)
    {
        TreeNode root1=new TreeNode(5);
        root1.left=new TreeNode(4);
        root1.right=new TreeNode(8);
        root1.left.left=new TreeNode(11);
        root1.left.left.left=new TreeNode(7);
        root1.left.left.right=new TreeNode(2);
        root1.right.left=new TreeNode(13);
        root1.right.right=new TreeNode(4);
        root1.right.right.right=new TreeNode(1);
        TreeNode root2=new TreeNode(0);
        root2.left=new TreeNode(3);
        root2.left.right=new TreeNode(1);
        root2.right=new TreeNode(0);
        root2.left.left=new TreeNode(9);
        root2.left.left.left=new TreeNode(5);
        root2.right.left=new TreeNode(17);
        root2.right.right=new TreeNode(0);
        root2.right.right.right=new TreeNode(1);
        mergetrees(root1,root2);
        System.out.println(root2);
    }
}
