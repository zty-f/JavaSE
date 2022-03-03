/**
 * @author: zty
 * @program: JavaSE
 * @ClassName Test06
 * @description:
 * @create: 2022-02-13 11:38
 * @Version 1.0
 **/
package main.zty.算法题测试;

import java.util.LinkedList;
import java.util.Queue;

//二叉树序列化和反序列化！！！
public class Test06 {

        //深度优先搜索！！！dfs
        public String serialize(TreeNode root) {
            if(root == null)return "1001";
            StringBuffer res=new StringBuffer();
            res.append(root.val).append(",");
            res.append(serialize(root.left)).append(",");
            res.append(serialize(root.right));
            return res.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] s = data.split(",");
            Queue<Integer> queue = new LinkedList<>();
            for(String ss:s){
                queue.offer(Integer.parseInt(ss));
            }
            return helper(queue);
        }
        public TreeNode helper(Queue<Integer> queue) {
            int t = queue.poll();
            if(t == 1001){
                return null;
            }
            TreeNode res = new TreeNode(t);
            res.left = helper(queue);
            res.right = helper(queue);
            return res;
        }
}
