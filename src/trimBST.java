public class trimBST
{
    public static TreeNode TrimBST(TreeNode root,int L,int R){
        if (root==null) return null;

        if (root.val>R) return TrimBST(root.left,L,R);
        if (root.val<L) return TrimBST(root.right,L,R);

        root.left=TrimBST(root.left,L,R);
        root.right=TrimBST(root.right,L,R);

        return root;
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
        TreeNode res=TrimBST(root,6,17);
        System.out.println(res);
    }
}
