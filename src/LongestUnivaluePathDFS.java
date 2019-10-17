public class LongestUnivaluePathDFS
{
    private static int longest=0;
    public static int longestUnivaluePath(TreeNode root)
    {
        getLongestBranch(root);
        return longest;
    }
    private static int getLongestBranch(TreeNode root)
    {
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 0;
        }
        int tempLongest=0;
        int length=0;
        int leftLength=getLongestBranch(root.left);
        int rightLength=getLongestBranch(root.right);
        if (root.left!=null && root.left.val==root.val){
            length=Math.max(1+leftLength,length);
            tempLongest+=(1+leftLength);
        }

        if (root.right!=null && root.right.val==root.val){
            length=Math.max(1+rightLength,length);
            tempLongest+=(1+rightLength);
        }
        longest=Math.max(longest,tempLongest);
        return length;
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(4);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(5);
        root.right.right.left.left=new TreeNode(5);
        root.right.right.left.right=new TreeNode(5);
        root.right.right.left.right.left=new TreeNode(2);
        root.right.right.left.right.right=new TreeNode(5);
        root.right.right.right=new TreeNode(6);
        root.right.right.right.left=new TreeNode(3);
        root.right.right.right.right=new TreeNode(6);
        int res=longestUnivaluePath(root);
        System.out.println(res);
    }
}
