public class InvertBST
{
    public static TreeNode invertTree(TreeNode root)
    {
        TreeNode cur=root;
        if (cur==null){
            return root;
        }

        TreeNode left=cur.left;
        TreeNode right=cur.right;
        cur.left=right;
        cur.right=left;
        invertTree(cur.left);
        invertTree(cur.right);
        return root;
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
        invertTree(root);
        System.out.println(root.right.right.val);
    }
}
