public class DiameterBST
{
    static int maxDiameter;
    public static int diameterOfBinaryTree(TreeNode root)
    {
        maxDiameter=0;
        helper(root);
        return maxDiameter;
    }
    static int helper(TreeNode root)
    {
        if (root==null){
            return 0;
        }

        int left=helper(root.left);
        int right=helper(root.right);

        int diameter=left+right;
        maxDiameter=Math.max(diameter,maxDiameter);

        return Math.max(left,right)+1;
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
        int res=diameterOfBinaryTree(root);
        System.out.println(res);
    }
}
