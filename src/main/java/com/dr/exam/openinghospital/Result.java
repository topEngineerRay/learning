package com.dr.exam.openinghospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    public static int hosital(int cityNodes, List<Integer> cityFrom, List<Integer> cityTo) {
        //思路：递归遍历每一个节点，检测两个方面，一此节点是否有hospital，若有结束检测，二若没有检测周边的的邻居节点，若有则结束检测，
        // 若没有则需要考虑在当前节点或者在周边节点当中建立医院->关键问题：到底在哪个节点建立医院？
        // 判断其所有邻居节点以及该节点当中，哪个节点的邻居最多，谁最多就在说的city建立

        //实现细节，先构建出图来

        Map<Integer,Boolean> nodeMap = new HashMap<>();
        Map<Integer,Integer> pathsMap = new HashMap<>();
        Map<Integer, List<Integer>> neiborMap = new HashMap<>();

        initMap(cityNodes, nodeMap);
        calculateNodePath(cityNodes,cityFrom,cityTo,pathsMap);
        getNeiborMap(cityNodes,cityFrom,cityTo,neiborMap);

        int hospital = getHospital(cityNodes, nodeMap, pathsMap, neiborMap);

        //目前实现的此方案有所缺陷，在第二个测试用例当中，因为采取的策略是判断哪个节点的相邻节点多的策略，但是这样没有考虑到整体性。
        //解决办法尝试，轮流把所有节点一开始修建医院，然后计算结果，从最后的结果当中找出最小的。

        //hospital算出来的不一定最小，遍历cityNode再算一次，每次事先将一个点赋值为修建，看是否有更小的方案。
        for(int i = 1;i<=cityNodes;i++){
            initMap(cityNodes,nodeMap);// 上一次的计算会覆盖掉map
            nodeMap.put(i,true);
            int hospitalNew = getHospital(cityNodes,nodeMap,pathsMap,neiborMap);
            if(hospitalNew<hospital){//如果有更少的方案则替代之前的方案
                hospital= hospitalNew;
            }
        }
        return hospital;
    }

    private static void initMap(int cityNodes, Map<Integer, Boolean> nodeMap) {
        for(int i = 1;i<=cityNodes;i++){
            nodeMap.put(i,false);
        }
    }

    private static int getHospital(int cityNodes, Map<Integer, Boolean> nodeMap, Map<Integer, Integer> pathsMap, Map<Integer, List<Integer>> neiborMap) {
        int hospital = 0;
        for(int i = 1;i<=cityNodes;i++){
            if(!nodeMap.get(i)){
                //判断其所有邻居节点以及该节点当中，哪个节点的邻居最多，谁最多就在说的city建立
                //考虑预先算出每个节点连接的节点数
                int maxPath = pathsMap.get(i);
                List<Integer> neibos = neiborMap.get(i);
                boolean canContinue = false;
                for(int j = 0;j< neibos.size();j++){
                    if(nodeMap.get(neibos.get(j))){
                        //已经有相邻医院
                        canContinue = true;
                        break;
                        //continue;
                    }
                }
                if(canContinue){
                    //break;
                    continue;
                }else{
                    for(int j = 0;j< neibos.size();j++){
                        int currentNode = neibos.get(j);
                        int currentPath = pathsMap.get(currentNode);
                        if(currentPath > maxPath){
                            nodeMap.put(currentNode,true);//在邻居建立医院
                            //reak;
                            continue;
                        }
                        nodeMap.put(i,true);// 在当前node建立医院
                    }
                }
            }
        }
        //计算nodemap中true的数量来判断医院个数
        for(int i = 1; i<=nodeMap.size();i++){
            if (nodeMap.get(i)){
                hospital++;
            }
        }
        return hospital;
    }

    public static void calculateNodePath(int cityNodes,List<Integer> cityFrom,List<Integer> cityTo,Map pathsMap){
        for(int i = 1;i<=cityNodes;i++) {
            int count = 0;
            for(int j= 0;j<cityFrom.size();j++){
                if(cityFrom.get(j)==i){
                    count ++;
                }
            }
            for(int j= 0;j<cityTo.size();j++){
                if(cityTo.get(j)==i){
                    count ++;
                }
            }
            pathsMap.put(i,count);
        }

    }
    public static void getNeiborMap(int cityNodes,List<Integer> cityFrom,List<Integer> cityTo,Map neiborMap){

        for(int i = 1;i<=cityNodes;i++) {
            List<Integer> neibors = new ArrayList<>();
            for(int j= 0;j<cityFrom.size();j++){
                if(cityFrom.get(j)==i){
                    neibors.add(cityTo.get(j));
                }
            }
            for(int j= 0;j<cityTo.size();j++){
                if(cityTo.get(j)==i){
                    neibors.add(cityFrom.get(j));
                }
            }
            neiborMap.put(i,neibors);
        }
    }

}


