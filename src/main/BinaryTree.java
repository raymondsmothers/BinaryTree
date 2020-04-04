package src.main;

public class BinaryTree
{
    private Node root;
    private int nodeCount = 0;

    /**
     * Returns a new BinaryTree with the root set to the given node
     * 
     * @param rootNode
     */
    public BinaryTree(Node rootNode)
    {
        this.root = rootNode;
        this.nodeCount++;
    }

    /**
     * Finds the next available spot
     * 
     * @param newNode
     * @param searchRoot
     * @return addedNode
     */
    public Node insert(Node newNode, Node searchRoot)
    {
        //check to the right of the current node
        if(isGreater(newNode, searchRoot) == newNode) 
        {
            if(searchRoot.getRightNode() == null) 
            {
                searchRoot.setRightNode(newNode);
                nodeCount++;
                return newNode;
            }
            else 
            {
                return insert(newNode, searchRoot.getRightNode());
            }

        }
        //check to the left of the curent node
        else
        {
            if(searchRoot.getLeftNode() == null) 
            {
                searchRoot.setLeftNode(newNode);
                nodeCount++;
                return newNode;
            }
            else 
            {
                return insert(newNode, searchRoot.getLeftNode());
            }
        }
    }

    /**
     * Returns the node with the greater value
     * 
     * @param first
     * @param second
     * @return greaterNode
     */
    private Node isGreater(Node first, Node second)
    {
        if(first.getKey() > second.getKey())
            return first;

        return second;
    }

    public Node search(Node searchRoot, int key) throws BinaryTreeException
    {
        if(searchRoot == null)
            return null;

        if(searchRoot.getKey() != key)
        {
            if(isGreater(searchRoot, new Node(key)) == searchRoot)
            {
                if(searchRoot.getLeftNode() != null)
                    return search(searchRoot.getLeftNode(), key);
                else
                    return null;
            }
            else
            {
                if(searchRoot.getRightNode() != null)
                    return search(searchRoot.getRightNode(), key);
                else
                    return null;
            }
        }

        return searchRoot;
    }

    public int getNodeCount()
    {
        return this.nodeCount;
    }

    public Node getRoot()
    {
        return this.root;
    }
}