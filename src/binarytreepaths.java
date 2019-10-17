import java.util.ArrayList;
import java.util.List;

public class binarytreepaths
{
    public static List<String> binaryTreePaths(TreeNode root)
    {
        List<String> answer=new ArrayList<>();
        helper(answer,root,"");
        return answer;
    }
    private static void helper(List<String> answer, TreeNode root, String path)
    {
        if (root==null){
            return;
        }
        path=path+root.val;
        if (root.left==null && root.right==null){
            answer.add(path);
            return;
        }

        helper(answer,root.left,path+"->");
        helper(answer,root.right,path+"->");
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
        List<String> result=new ArrayList<>();
        result=binaryTreePaths(root);
        System.out.println(result);
    }
}
