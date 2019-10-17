public class MindistanceBST
{
    static int last;
    static int res1;
    public static int  minDiff(TreeNode root)
    {
        last=-1000;
        res1=1000;
        minDiffBST1(root);
        return res1;
    }

    private static void minDiffBST1(TreeNode root)
    {
        if (root!=null){
            minDiffBST1(root.left);
            res1=Math.min(res1,root.val-last);
            last=root.val;
            minDiffBST1(root.right);
        }
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(6);
        int res=minDiff(root);
        System.out.println(res);
    }
}
