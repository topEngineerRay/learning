package com.dr.learning.model;

import java.util.ArrayList;
import java.util.List;

//数组实现
public class TreeNode {
    private Integer childId;
    private String cname;
    private Integer parentId;
    private List nodes = new ArrayList();
    
    public Integer getChildId() {
        return childId;
    }
    public void setChildId(Integer childId) {
        this.childId = childId;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Integer getParentId() {
        return parentId;
    }
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public List getNodes() {
        return nodes;
    }
    public void setNodes(List nodes) {
        this.nodes = nodes;
    }
    
}
