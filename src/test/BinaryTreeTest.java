package src.test;

import src.main.*;

public class BinaryTreeTest {
    public static void main(String args[])
    {
        int values[] = { 3, 6, 10, 11, 2, 0, 32 };
        int rootValue = 7;
        Node rootNode = new Node(rootValue);
        BinaryTree bTree = new BinaryTree(rootNode);

        System.out.println();

        for(int i = 0; i < values.length; i++)
        {
            Node newNode = new Node(values[i]);
            System.out.println(bTree.insert(newNode, bTree.getRoot()).getKey());
        }

        System.out.println(bTree.getRoot().getLeftNode());

        System.out.println();

        Node node = bTree.search(bTree.getRoot(), 3);
        System.out.println(node.getLeftNode().getKey());
        System.out.println(node.getKey());
        System.out.println(node.getRightNode().getKey());

        System.out.println();

        Node node1 = bTree.search(bTree.getRoot(), 10);
        if(node1.getLeftNode() != null)
            System.out.println(node1.getLeftNode().getKey());
        else
            System.out.println("null");
        System.out.println(node1.getKey());
        if(node1.getRightNode() != null)
            System.out.println(node1.getRightNode().getKey());
        else
            System.out.println("null");

        System.out.println();

        Node node2 = bTree.search(bTree.getRoot(), 2);
        if(node2.getLeftNode() != null)
            System.out.println(node2.getLeftNode().getKey());
        else
            System.out.println("null");
        System.out.println(node2.getKey());
        if(node2.getRightNode() != null)
            System.out.println(node2.getRightNode().getKey());
        else
            System.out.println("null");
    }
}