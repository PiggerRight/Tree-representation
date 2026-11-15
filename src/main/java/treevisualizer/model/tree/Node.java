package treevisualizer.model.tree;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Node
{
    private int value;
    private Node parent;
    private List<Node> children;

    public Node(int value)
    {
        this.value =value;
        this.parent = null;
        this.children = new ArrayList<>();
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

    public Node getParent()
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

    public Node getRoot(){
        Node current = this;
        while (current.getParent() != null) {
            current = current.getParent();
        }
        return current;
    }
    
    public boolean addChild(Node child)
    {
        if (child == null || child.getParent() != null || child.getRoot() == this.getRoot())
        {
            return false;
        }

        children.add(child);
        child.parent = this;
        return true;
    }

    public boolean removeChild(Node child)
    {
        if (child == null || child.getParent() != this || !children.contains(child))
        {
            return false;
        }

        child.parent = null;
        children.remove(child);
        return true;
    }

    public List<Node> getChildren()
    {
        return Collections.unmodifiableList(children);
    }
}