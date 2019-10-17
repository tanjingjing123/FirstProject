public class sumofRootBinaryNumbers
{
    public static int sumRootToLeaf(TreeNode root)
    {
        return sum(root,0);
    }

    public static int sum(TreeNode root,int parentSum)
    {
        int doubleParent=parentSum*2;
        if (root.left==null && root.right==null)
            return doubleParent+root.val;

        int leftSum=(root.left !=null) ? sum(root.left,doubleParent+root.val) :0;
        int rightSum=(root.right!=null) ?sum(root.right,doubleParent+root.val):0;

        return leftSum+rightSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(1);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.left.left = new TreeNode(0);
        root.left.left.right = new TreeNode(1);
        int res = sumRootToLeaf(root);
        System.out.println(res);
    }
}
