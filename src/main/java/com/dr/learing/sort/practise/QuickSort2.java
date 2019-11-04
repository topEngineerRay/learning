package com.dr.learing.sort.practise;

public class QuickSort2 {
    //快速排序在序列中元素很少时，效率将比较低，不然插入排序，因此一般在序列中元素很少时使用插入排序，这样可以提高整体效率。
    public static void main(String[] args) {
        int a[] = { 6, 2, 1, 3, 1, 134, 5 };
        //快速排序是对冒泡排序的改进
        //选择一个基准值，从左至右依次比较两个相邻元素，每一次把最大的移到最后
        //快速排序算法改进：每次都把第一个作为基准值，有时间自己试一下

        //选择第一个作为基准值

        quickSort(a,0,a.length-1);
    }

    //快速排序需要一个数组，一个起始位置，一个末尾位置
    private static void quickSort(int[] array,  int begin,int end) {
        if(begin>=0&&begin<array.length&&end>=0&&end<array.length&&begin<end){
            int i=begin;
            int j = end;
            int vot =array[i];//基准值
            while(i!=j){//没有到中间
                while(i<j&&array[i]<=vot)
                    j--;
                    if(i<j)
                        array[i++]=array[j];

                    while(i<j&&array[i]<=vot)
                        i++;

                    if(i<j)
                        array[j--]=array[i];
            }
            array[i]=vot;
            System.out.println(begin+".."+end+",vot="+vot+" ");
            System.out.println("-----------------------");

            print(array);
            quickSort(array,begin,j-1);
            quickSort(array,i+1,end);
        }
    }
    private static void print(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }

}
