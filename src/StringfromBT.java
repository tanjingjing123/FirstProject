public class StringfromBT
{
    public static void helper(TreeNode t,StringBuilder ans){
        if (t==null)
            return;

        ans.append(t.val);
        if (t.left!=null){
            ans.append("(");
            helper(t.left,ans);
            ans.append(")");
        }
        if (t.left==null && t.right!=null){
            ans.append("()");
        }
        if (t.right!=null){
            ans.append("(");
            helper(t.right,ans);
            ans.append(")");
        }
    }
    public static String tree2str(TreeNode t){
        StringBuilder ans=new StringBuilder();
        helper(t,ans);
        return ans.toString();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(25);
        String res=tree2str(root);
        System.out.println(res.toString());
    }
}
