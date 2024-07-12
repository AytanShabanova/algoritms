package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBFSExample {
static  void bfs(Node root){
    Queue<Node>queue=new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()){
       Node node= queue.poll();
        System.out.println(node.value+" node value");
        if (node.left !=null){
            System.out.println(queue.add(node.left)+" left element");
        }
        if (node.right !=null){
            System.out.println(queue.add(node.right)+" right element");
        }
    }
}

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.left.left=new Node(5);
        bfs(root);
        System.out.println("left elements+"+root.left);
        System.out.println("right elements+"+root.right);
    }
}
