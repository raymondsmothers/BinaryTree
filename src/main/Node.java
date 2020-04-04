package src.main;

/**
 * Basic Implementation of an integer node for a binary tree
 */
public class Node 
{

    private Node leftNode;
    private Node rightNode;
    private int key;

    /**
        Simple constructor that will return a node with default values
    */
    public Node()
    {
        this.key = 0;
        this.leftNode = null;
        this.rightNode = null;
    }

    /**
        Constructor that will return a node with the given value

        @parameter key
            Key of the returned node.
    */
    public Node(int key)
    {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    /**
        Sets value of the node to the given value

        @parameter value
            Value to replace the current node value with.
    */
    public void setKey(int key)
    {
        this.key = key;
    }

    /**
        Gets the value of the node
    */
    public int getKey()
    {
        return this.key;
    }

    /**
        Sets the LeftNode with the given node

        @parameter node
            Node to replace the current leftNode with.
    */
    public void setLeftNode(Node node)
    {
        this.leftNode = node;
    }

    /**
        Gets the leftNode value
    */
    public Node getLeftNode()
    {
        if(this.leftNode == null)
            return null;
        return this.leftNode;
    }

    /**
        Sets the rightNode with the given node

        @parameter node
            Node to replace the current rightNode with.
    */
    public void setRightNode(Node node)
    {
        this.rightNode = node;
    }

    /**
        Gets the rightNode value
    */
    public Node getRightNode()
    {
        if(this.rightNode == null)
            return null;
        return this.rightNode;
    }
}