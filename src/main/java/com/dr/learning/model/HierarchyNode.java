package com.dr.learning.model;

import java.util.HashSet;
import java.util.Set;

public class HierarchyNode {
    
    private String customerId;
    private HierarchyNode parent;
    private Set<HierarchyNode> children = new HashSet<>();
    public HierarchyNode(HierarchyNode parent) {
        this.parent = parent;
    }//

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public HierarchyNode getParent() {
        return parent;
    }

    public void setParent(HierarchyNode parent) {
        this.parent = parent;
    }

    public Set<HierarchyNode> getChildren() {
        return children;
    }

    public void setChildren(Set<HierarchyNode> children) {
        this.children = children;
    }

}
