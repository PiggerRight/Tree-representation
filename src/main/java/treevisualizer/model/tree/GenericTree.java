import Node.java;
import java.util.Queue;
import java.util.LinkedList;

public class GenericTree
{
    private Node root;


    public GenericTree(Node root)
    {
        this.root = root;
    }

    public boolean insertNode(Node parent, Node child)
    {
        if ( parent == null || child == null || child.root == parent.root )
        {
            return false;
        } 

        parent.addChild(child);
        return true;
    }

    public boolean deleteNode(Node node)
    {
        if (node == null || node.root != this.root )
        {
            return false;
        }

        Node parent = node.getparent();
        parent.removeChild(node);
        return true;

    }

    public boolean updateNodeValue(Node node, int newValue)
    {
        if (node == null || node.root != this.root )
        {
            return false;
        }

        node.setValue(newValue);
        return true;
    }

    public void traverseDFS(Node node)
    {
        if (node == null)
        {
            return;
        }

        System.out.print(node.getValue() + " ");

        for (Node child : node.getChildren())
        {
            traverseDFS(child);
        }
    }

    public void traverseBFS(Node node)
    {
        if (node == null)
        {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.getValue() + " ");

            for (Node child : current.getChildren())
            {
                queue.add(child);
            }
        }
    }

    public Node searchNode(Node node, int value)
    {
        if(node == null)
        {
            return null;
        }

        if (node.getValue() == value)
        {
            return node;
        }

        for (Node child : node.getChildren())
        {
            Node result = searchNode(child, value);
            if(result != null)
            {
                return result;
            }
        }

        return null;
    }
}