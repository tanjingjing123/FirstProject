public class maximumdepthBT
{
    public static int maxDepth(TreeNode root)
    {
        if (root==null)
            return 0;

        int count1=maxDepth(root.left);
        int count2=maxDepth(root.right);

        int x=count1>count2?count1:count2;
        return x+1;
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
        int res=maxDepth(root);
        System.out.println(res);
    }
}
