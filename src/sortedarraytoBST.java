public class sortedarraytoBST
{
    public static TreeNode sortedArrayToBST(int[] nums)
    {
        return helper(nums,0,nums.length-1);
    }
    private static TreeNode helper(int[] nums,int s,int e)
    {
        if (s>e) return null;
        if (s==e) return new TreeNode(nums[s]);

        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,s,mid-1);
        root.right=helper(nums,mid+1,e);
        return root;
    }

    public static void main(String[] args)
    {
        int[] nums={-12,-10,-9,-5,0,3,5,6,8,10,15};
        TreeNode root=sortedArrayToBST(nums);
        System.out.println(root);

    }
}
