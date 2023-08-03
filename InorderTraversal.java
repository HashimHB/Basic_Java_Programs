import java.util.*;

class Node{
    int data;
    Node left,right;

    Node(int v){
        data = v;
        left=right=null;
    }
}

class InorderTraversal{

    public static void printinorder(Node node){
        if(node==null){
            return;
        }

        printinorder(node.left);

        System.out.print(node.data+" ");

        printinorder(node.right);
    }





    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.right  = new Node(6);
        System.out.println("INORDER TRAVERSAL IS GIVEN AS:");
        printinorder(root);

    }
}