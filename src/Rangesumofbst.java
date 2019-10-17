public class Rangesumofbst
{
    public static int rangeSumBST(TreeNode root, int L,int R)
    {
        if (root==null)
            return 0;
        if (root.val>=L && root.val<=R){
            int leftSum=rangeSumBST(root.left,L,R);
            int rightSum=rangeSumBST(root.right,L,R);
            return root.val+leftSum+rightSum;
        }else if (root.val<L)
            return rangeSumBST(root.right,L,R);

        return rangeSumBST(root.left,L,R);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(18);
        root.right.right = new TreeNode(25);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(0);
        root.left.left.right = new TreeNode(4);
        int res = rangeSumBST(root, 5, 24);
        System.out.println(res);
    }
}
