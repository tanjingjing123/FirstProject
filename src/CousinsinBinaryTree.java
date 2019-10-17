public class CousinsinBinaryTree
{
    private static int xDepth=-1;
    private static int yDepth=-1;
    private static TreeNode xParent;
    private static TreeNode yParent;

    public static boolean isCousins(TreeNode root, int x, int y)
    {
        helper(root,x,y,1);
        return xDepth==yDepth && xParent!=yParent;
    }

    private static void helper(TreeNode node,int x,int y,int depth)
    {
        if (node==null)
            return;

        TreeNode left=node.left;
        TreeNode right=node.right;
        if (left!=null){
            if (left.val==x){
                xDepth=depth;
                xParent=node;
            }else if (left.val==y){
                yDepth=depth;
                yParent=node;
            }
        }
        if (right!=null){
            if (right.val==x){
                xDepth=depth;
                xParent=node;
            }else if (right.val==y){
                yDepth=depth;
                yParent=node;
            }
        }

        helper(left,x,y,depth+1);
        helper(right,x,y,depth+1);
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(5);
        root.right=new TreeNode(12);
        root.right.left=new TreeNode(10);
        root.right.left.left=new TreeNode(9);
        root.right.left.right=new TreeNode(11);
        root.right.right=new TreeNode(15);
        root.right.right=new TreeNode(15);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(7);
        root.left.right.left=new TreeNode(6);
        root.left.left.left=new TreeNode(0);
        root.left.left.right=new TreeNode(4);
        boolean res=isCousins(root,2,10);
        System.out.println(res);
    }
}
