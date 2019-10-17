import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrderTraveral
{
    public static List<List<Integer>> levelOrderBottom(TreeNode root)
    {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null)
            return res;

        bfs(root,res);
        return res;
    }

    private static void bfs(TreeNode root, List<List<Integer>> res)
    {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);

        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            while (size-->0){
                TreeNode nodes=q.poll();
                list.add(nodes.val);
                if (nodes.left!=null)
                    q.offer(nodes.left);
                if (nodes.right!=null)
                    q.offer(nodes.right);
            }
            res.add(0,list);
        }
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
        List<List<Integer>> result=new ArrayList<>();
        result=levelOrderBottom(root);
    }
}
