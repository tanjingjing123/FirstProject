import java.util.LinkedList;
import java.util.Queue;

public class univaluedBST
{
    public static boolean isUnivalued(TreeNode root)
    {
        if (root==null){
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            for (int i=0;i<queue.size();i++){
                TreeNode node=queue.poll();
                if (node.left!=null){
                    if (node.left.val!=node.val){
                        return false;
                    }
                    queue.add(node.left);
                }
                if (node.right!=null)
                {
                    if (node.val!=node.right.val){
                        return false;
                    }
                    queue.add(node.right);
                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
            TreeNode root=new TreeNode(1);
            root.left=new TreeNode(1);
            root.right=new TreeNode(1);
            root.left.left=new TreeNode(1);
            root.left.left.left=new TreeNode(1);
            root.left.left.right=new TreeNode(1);
            root.right.left=new TreeNode(1);
            root.right.right=new TreeNode(1);
        root.right.right.left=new TreeNode(2);
            root.right.right.right=new TreeNode(1);
            boolean res=isUnivalued(root);
            System.out.println(res);

    }
}
