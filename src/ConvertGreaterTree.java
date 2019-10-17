import java.util.Stack;

public class ConvertGreaterTree
{
    public static TreeNode convertBST(TreeNode root)
    {
        if (root==null) return null;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        int rightSum=0;
        while (node!=null || !stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node=node.right;
            }
            node=stack.pop();
            node.val+=rightSum;
            rightSum=node.val;
            node=node.left;
        }
        return root;
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
        TreeNode result=convertBST(root);
        System.out.println(result);
    }
}
