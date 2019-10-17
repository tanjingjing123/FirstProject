import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageBineryTree
{
    public static List<Double> averageoflevels(TreeNode root)
    {
        List<Double> list=new ArrayList<Double>();
        if (root!=null){
            Queue<TreeNode> queue= new LinkedList<TreeNode>();
            queue.offer(root);
            double sum=0.0;
            int size,i;
            TreeNode cur;
            double average;
            while (!queue.isEmpty()){
                size=queue.size();
                sum=0.0;
                for (i=0;i<size;i++){
                    cur=queue.poll();
                    sum+=(double)cur.val;
                    if (cur.left!=null)
                        queue.offer(cur.left);

                    if (cur.right!=null)
                        queue.offer(cur.right);
                }
                average=sum/(double)size;
                list.add(average);
            }
        }
        return list;
    }

    public static void main(String[] args)
    {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        List<Double> res=new ArrayList<Double>();
        res=averageoflevels(root);
        System.out.println(res);
    }
}
