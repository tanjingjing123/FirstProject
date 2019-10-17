public class PathSum
{
    public static boolean hasPathSum(TreeNode root, int sum)
    {
        if (root==null)
            return false;
        if (root.left==null && root.right==null){
            if (root.val==sum){
                return true;
            }else return false;
        }else {
            sum-=root.val;
            return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
        }
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.right=new TreeNode(1);
        boolean res=hasPathSum(root,22);
        System.out.println(res);
    }
}
