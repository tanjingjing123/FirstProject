import java.util.HashMap;
import java.util.Map;

public class Subtreeofanothertree
{
    public static boolean isSubtree(TreeNode s,TreeNode t){
        if (s==null)
            return false;
        if(isSame(s,t))
            return true;
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }

    private static boolean isSame(TreeNode s,TreeNode t)
    {
        if (s==null && t==null)
            return true;
        if (s==null || t==null)
            return false;
        if (s.val!=t.val)
            return false;
        return isSame(s.right,t.right) && isSame(s.left,t.left);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left=new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.left.right.left=new TreeNode(0);
        root.left.right.right=new TreeNode(6);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(13);
        root.right.right.left = new TreeNode(11);
        root.right.right.right = new TreeNode(15);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(8);
        root2.right = new TreeNode(13);
        root2.right.left = new TreeNode(11);
        root2.right.right = new TreeNode(15);

        boolean res=isSubtree(root,root2);
        System.out.println(res);
    }
}
