import java.util.LinkedList;
import java.util.List;

public class Leafsimilartrees
{
    static List<Integer> result;
    public static boolean leafSimilar(TreeNode root1,TreeNode root2)
    {
        result=new LinkedList<>();
        dfs(root1,false);
        dfs(root2,true);
        return result.size()==0;
    }
   static void dfs(TreeNode root1,boolean removeFlag)
    {
        if (root1==null){
            return;
        }

        dfs(root1.left,removeFlag);
        if (root1.left==null && root1.right==null){
            if (!removeFlag){
                result.add(root1.val);
            }else {
                if (result.get(0)==root1.val){
                    result.remove(0);
                }
            }
        }
        dfs(root1.right,removeFlag);
    }

    public static void main(String[] args)
    {
        TreeNode root1=new TreeNode(3);
        root1.left=new TreeNode(5);
        root1.right=new TreeNode(1);
        root1.right.left=new TreeNode(9);
        root1.right.right=new TreeNode(8);
        root1.left.left=new TreeNode(6);
        root1.left.right=new TreeNode(2);
        root1.left.right.left=new TreeNode(7);
        root1.left.right.right=new TreeNode(4);
        TreeNode root2=new TreeNode(6);
        root2.left=new TreeNode(4);
        root2.right=new TreeNode(8);
        root2.right.left=new TreeNode(9);
        root2.right.right=new TreeNode(11);
        root2.left.left=new TreeNode(6);
        root2.left.right=new TreeNode(3);
        root2.left.right.left=new TreeNode(7);
        root2.left.right.right=new TreeNode(4);
        boolean res=leafSimilar(root1,root2);
        System.out.println(res);
    }
}
