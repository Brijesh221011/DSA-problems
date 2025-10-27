import java.util.HashMap;
import java.util.Map;

public class LRU {

    class LRUCache {
    Map<Integer,Node>hm;
    Node head=new Node(0,0),tail=new Node(0,0);
    int cap;
    public LRUCache(int capacity) {
        hm=new HashMap<>();
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    class Node{
        Node prev,next;
        int key,val;
        Node(int key,int value){
            this.key=key;
            this.val=value;
        }
    }

    public void remove(Node node) {
        hm.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node) {
        hm.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public int get(int key) {
        if(hm.containsKey(key)){
            Node node=hm.get(key);
            remove(node);
            insert(node);
            return node.val;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            remove(hm.get(key));
        }
        if(hm.size()==cap){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
}

    
}
