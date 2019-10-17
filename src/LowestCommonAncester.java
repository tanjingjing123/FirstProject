public class LowestCommonAncester
{
    public static TreeNode lowestCommonAncester(TreeNode root,TreeNode p,TreeNode q)
    {
        while (true){
            if (root==null) return null;
            if (root==p || root==q) return root;
            if (root.val>p.val && root.val>q.val)
            {
                return root.left;
            }else if (root.val<p.val && root.val<q.val){
                root=root.right;
            }else {
                return root;
            }
        }
    }
    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(6);
        TreeNode node1=new TreeNode(2);
        root.left=node1;
        TreeNode node2=new TreeNode(8);
        root.right=node2;
        node1.left=new TreeNode(0);
        node1.right=new TreeNode(4);
        node1.right.left=new TreeNode(3);
        node1.right.right=new TreeNode(5);
        node2.left=new TreeNode(7);
        node2.right=new TreeNode(9);
        TreeNode res=lowestCommonAncester(root,node1,node2);
        System.out.println(res);
    }

}
