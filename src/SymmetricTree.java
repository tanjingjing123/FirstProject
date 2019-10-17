import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree
{
    public static boolean isSymmetric(TreeNode root){
        if (root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);

        while (!q.isEmpty()){
            TreeNode leftSub=q.poll();
            TreeNode rightSub=q.poll();
            if (leftSub==null && rightSub==null) continue;
            if (leftSub==null || rightSub==null) return false;
            if (leftSub.val!=rightSub.val) return false;
            q.offer(leftSub.left);
            q.offer(rightSub.right);
            q.offer(leftSub.right);
            q.offer(rightSub.left);
        }
        return true;
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.left.left=new TreeNode(1);
        root.left.left.right=new TreeNode(2);
        root.left.right=new TreeNode(6);
        root.left.right.left=new TreeNode(3);
        root.left.right.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.left.left=new TreeNode(4);
        root.right.left.right=new TreeNode(3);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(2);
        root.right.right.right=new TreeNode(1);
        boolean res=isSymmetric(root);
        System.out.println(res);

    }
}
