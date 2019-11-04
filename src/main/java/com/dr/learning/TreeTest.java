package com.dr.learning;

import com.dr.learning.model.HierarchyNode;

public class TreeTest {

    public static void main(String[] args) {
        HierarchyNode treeRootNode = new HierarchyNode(null);
        treeRootNode.setCustomerId("root");
        // add child to root node
        HierarchyNode childNode = addChild(treeRootNode, "child-1");
        // add child to the child node created above
        addChild(childNode, "child-11");
        addChild(childNode, "child-11");

        // add child to root node
        HierarchyNode child2 = addChild(treeRootNode, "child-2");
        // add child to the child node created above
        addChild(child2, "child-21");
        addChild(child2, "child-21");
       // printTree(treeRootNode, "-");
        //printTree(childNode, "-");
        printTree(child2, "-");
        //System.out.println(checkIfThereAreDuplicatedNode(treeRootNode));
    }

    private static HierarchyNode addChild(HierarchyNode parent, String id) {// 第一个参数是higher-level
                                                                            // customer,第二个参数是当前node的id
        HierarchyNode node = new HierarchyNode(parent);
        node.setCustomerId(id);
        parent.getChildren().add(node);
        return node;
    }

    private static boolean checkIfThereAreDuplicatedNode(HierarchyNode hierarchyNode) {//目前思路根据是否有重复的CustomerNodeId来判断
        return false;
    }
    private static boolean checkIfTheHierarchyIsValid(HierarchyNode hierarchyNode){
        return false;
    }
    
    private static void printTree(HierarchyNode node, String appender) {
        System.out.println(appender + node.getCustomerId());
        for (HierarchyNode each : node.getChildren()) {
            printTree(each, appender + appender);
        }
    }
    
    private static void getTreeByCustomerId(String customerId){
        
    }
    
}