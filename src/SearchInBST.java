public class SearchInBST
{
    public static TreeNode searchBST(TreeNode root,int val){
        if (root==null)
            return null;
        while (root!=null && val!=root.val){
            if (val<root.val){
                root=root.left;
            }else {
                root=root.right;
            }
        }

        return root;
    }

    public static void main(String[] args){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        TreeNode res=searchBST(root,0);
        System.out.println(res);
    }
}
