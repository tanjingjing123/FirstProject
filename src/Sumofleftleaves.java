public class Sumofleftleaves
{
    public static int sumOfLeftLeaves(TreeNode root)
    {
        int sum=0;
        if (root==null)
            return sum;

        if (isNodeALeafNode(root.left)){
            sum+=root.left.val;
        }
        return sum+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }

    private static boolean isNodeALeafNode(TreeNode node)
    {
        return node!=null && node.left==null && node.right==null;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);
        int res=sumOfLeftLeaves(root1);
    }
}
