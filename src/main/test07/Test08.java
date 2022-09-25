package main.test07;

import java.util.HashMap;

/**
 * @version V1.0
 * @ClassName: main.test07.Test08.java
 * @Copyright swpu
 * @author: zty-f
 * @date: 2022-09-25 21:17
 * @Description: LRU
 */
// 1.使用哈希表+双向链表实现LinkedHashMap

public class Test08 {
    class MyNode{
        int key;
        int value;
        MyNode pre;
        MyNode next;
        public MyNode(){}
        public MyNode(int key1,int value1){key=key1;value=value1;}
    }
    HashMap<Integer,MyNode> map = new HashMap<>();
    int size;
    int capacity;
    MyNode head;
    public Test08(int capacity) {
        size = 0;
        this.capacity = capacity;
        head = new MyNode();
        head.next = head;
        head.pre = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            MyNode node = map.get(key);
            moveToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        MyNode tt = map.get(key);
        if(!map.containsKey(key)){
            MyNode node = new MyNode(key,value);
            insert(node);
            size++;
            map.put(key,node);
            if(size>capacity){
                int k = head.pre.key;
                remove(head.pre);
                map.remove(k);
                size--;
            }
        }else{
            tt.value = value;
            moveToHead(tt);
        }
    }
    public void insert(MyNode node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
    public void remove(MyNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    public void moveToHead(MyNode node){
        remove(node);
        insert(node);
    }
}