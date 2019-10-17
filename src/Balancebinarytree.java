public class Balancebinarytree
{
    private static int getHeight(TreeNode root){
        if (root==null) return 0;
        int L=getHeight(root.left);
        int R=getHeight(root.right);
        return 1+Math.max(L,R);
    }
    public static boolean isBalanced(TreeNode root){
        return root==null||Math.abs(getHeight(root.left)-getHeight(root.right))<=1 &&isBalanced(root.left)&&isBalanced(root.right);
    }

    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(7);
        root.left.left.left=new TreeNode(4);
        root.left.left.right=new TreeNode(5);
        boolean res=isBalanced(root);
    }
}
