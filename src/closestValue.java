public class closestValue
{
    public static int ClosestValue(TreeNode root, double target)
    {
        int val=root.val;
        if (root.val<target && root.right!=null){
            val=ClosestValue(root.right,target);
        }
        if (root.val>target && root.left!=null)
        {
            val=ClosestValue(root.left,target);
        }
        return Math.abs(target-root.val)>Math.abs(target-val)?val:root.val;
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(5);
        root.right=new TreeNode(10);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(7);
        root.left.left.left=new TreeNode(2);
        root.left.left.right=new TreeNode(4);
        double target=3.714286;
        int result=ClosestValue(root,target);
        System.out.println(result);
    }
}
