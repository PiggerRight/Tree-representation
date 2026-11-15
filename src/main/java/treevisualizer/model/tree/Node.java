import java.util.List;
import java.util.ArrayList;


public class Node
{
    private int value;
    private Node parent;
    private List<Node> Children;
    private Node root;

    public Node(int value)
    {
        this.value =value;
        this.parent = null;
        this.Children = new ArrayList<>();
        this.root = null;

    }

    public int getValue()
    {
        return value;
    }

    public boolean setValue(int value)
    {
        this.value = value;
        return true;

    }

    public Node getparent()
    {
        return parent;
    }

    public boolean setParent(Node newParent)
    {
        if (this.parent == newParent) 
        {
            return false;
        }

        if (newParent == null) 
        {
            return this.parent.removeChild(this);
        }

        return newParent.addChild(this);

    }

    public boolean setRoot(Node newRoot)
    {
        if (this.root == newRoot)
        {
            return false;
        }

        this.root = newRoot;
        return true;
    }
    
    public boolean addChild(Node child)
    {
        if (child == null || child.parent != null || child.root != null)
        {
            return false;
        }


        child.setRoot(this.root);
        Children.add(child);
        child.parent = this;
        return true;
    }

    public boolean removeChild(Node child)
    {
        if (child == null || child.parent != this || !Children.contains(child))
        {
            return false;
        }

        child.parent = null;
        Children.remove(child);
        return true;
    }

    public List<Node> getChildren()
    {
        return Children;
    }


}