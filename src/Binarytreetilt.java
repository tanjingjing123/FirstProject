import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binarytreetilt
{
    public static int findTilt(TreeNode root)
    {
        if (root==null) return 0;
        return findTilt(root.left)+findTilt(root.right)+Math.abs(sumTree(root.left)-sumTree(root.right));
    }
    private static final int sumTree(TreeNode root)
    {
        if (root==null) return 0;
        return root.val+sumTree(root.left)+sumTree(root.right);
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(7);
        root.left.left.left=new TreeNode(4);
        root.left.left.right=new TreeNode(5);
        int result=findTilt(root);
        System.out.println(result);
    }
}
