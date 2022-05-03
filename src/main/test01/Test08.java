package main.test01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @version V1.0
 * @ClassName: main.test.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-04-07 10:56
 * @Description: list复制
 */
public class Test08 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        List<Integer> cp = new ArrayList<>(list);
        cp.add(222);
        System.out.println(list);
        System.out.println(cp);
    }
}
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Solution {

    // List是LinkedList ArrayList的实现接口，所以可以使用其中一个作为结果返回，可以直接转换为List

    private List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();  //含有很多方法，在很多时候比ArrayList好用！
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root,target);
        return res;
    }
    public void dfs(TreeNode root,int target){
        if(root==null){
            return;
        }
        target-=root.val;
        list.addLast(root.val);
        if(root.left==null&&root.right==null&&target==0){
            res.add(new LinkedList<>(list));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        list.removeLast();//这个比较重要，可以避免在递归函数里面传值。。
    }
}
