package com.dr.learing.sort.practise;

public class QuickSort {
    //快速排序在序列中元素很少时，效率将比较低，不然插入排序，因此一般在序列中元素很少时使用插入排序，这样可以提高整体效率。
    public static void main(String[] args) {
        int a[] = { 6, 1, 2, 3, 1, 134, 5 };
        //快速排序是对冒泡排序的改进
        //选择一个基准值，从左至右依次比较两个相邻元素，每一次把最大的移到最后
        //快速排序算法改进：每次都把第一个作为基准值，有时间自己试一下

        //选择第一个作为基准值
        int location = quickSort(a);
        //System.out.println(location);
       /* for (int i : a) {
            System.out.println(i);
        }*/
    }

    //快速排序需要一个数组，一个起始位置，一个末尾位置
    private static int quickSort(int[] array) {
        int left = 0;
        int right = array.length-1;

        int threshold = array[left];
        //当first小于last的时候说明还需要继续比较，只有当first等于last的时候才完成一次排序
        while (left < right) {
            //若右边元素大于左边元素，则无需交换位置，继续向下进行
            if (threshold < array[right]) {
                //右侧往左遍历
                right--;
            }
            //这个if结束时，若left不等于right,则找到了一个值小于基准值，其位置即为right的位置
            if(left!=right){
                if(array[left]>threshold){
                    //此时找到一个值大于基准值，其位置为当前left+1，且与当前right值进行交换
                    int temp = array[right];
                    array[right] = array[left];
                    array[left]=temp;
                }else{
                    //若不大于基准值，则继续往右边找
                    left++;
                }
            }

        }
        //当到这儿时left和right必然相等，就是threshold的位置,交换此位置和threshold
        array[0] = array[left];
        array[left] = threshold;

        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，
        //但是两边的顺序还有可能是不一样的，进行下面的递归调用
        //{ 5, 1, 2, 3, 1,  6 ,134};

        quickSort(array);
        for (int i : array) {
            System.out.println(i);
        }
        return left;
    }
}
