public class SameTree {
    public static boolean isSametree(TreeNode p,TreeNode q)
    {
        if (p==null && q==null) return true;
        if (p==null ||q==null || p.val!=q.val) return false;
        return isSametree(p.right,q.right) && isSametree(p.left,q.left);
    }
}
