public class IncreasingBST
{
    private static TreeNode newRoot;
    private static TreeNode newRootCopy;
    public static TreeNode increasingBST(TreeNode root)
    {
        increasingBSTHelper(root);
        return newRootCopy;
    }

    private static void increasingBSTHelper(TreeNode root)
    {
        if (root==null)
            return;
        increasingBSTHelper(root.left);

        if (newRoot==null){
            newRoot=new TreeNode(root.val);
            newRootCopy=newRoot;
        }
        else {
            TreeNode newNode=new TreeNode(root.val);
            newRoot.right=newNode;
            newRoot=newRoot.right;
        }
        increasingBSTHelper(root.right);
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
        TreeNode res=increasingBST(root);
        System.out.println(res);
    }
}
