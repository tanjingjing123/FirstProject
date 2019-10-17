import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class balancedsearchtree
{
    public static boolean isBalanced(TreeNode root) {
        return check(root) == -1 ? false : true;

    }
    public static int check(TreeNode root){

        if(root == null)return 0;

        else{

            int l = check(root.left);
            int r = check(root.right);
            return (l == -1 || r == -1 || Math.abs(l - r) > 1) ? -1 : 1 + Math.max(l, r);

        }
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
