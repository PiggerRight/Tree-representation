package treevisualizer.model.tree;

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
        this.root = this;

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

    public Node getRoot()
    {
        return root;
    }

    private void updateRoot(Node newRoot)
    {
        this.root = newRoot;

        for (Node child : Children)
        {
            child.updateRoot(newRoot);
        }
    }
    
    public boolean addChild(Node child)
    {
        if (child == null || child.parent != null || child == this.root)
        {
            return false;
        }


        Children.add(child);
        child.parent = this;
        child.updateRoot(this.root);
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
        child.updateRoot(child);
        return true;
    }

    public List<Node> getChildren()
    {
        return Children;
    }


}