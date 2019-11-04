package com.dr.exam;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 6, 1, 2, 1, 134, 5, };
        int b[] = { 6, 1, 2, 1, 134, 5, };
        //从左至右依次比较两个相邻元素，每一次把最大的移到最后，稳定
        a = bubbleSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static int[] bubbleSort(int a[]) {
        //外层循环控制趟数，内层循环进行真正循环，一共需要进行的循环次数为数组长度减去1次
        for (int i = 0; i < a.length-1; i++) {
            //每次所需比较的元素个数比比上一次的少1，所一这里length减去i
            for(int j = 0;j<a.length-1-i;j++) {
                if (a[j+1] < a[j]) {
                    int tempVariable = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tempVariable;
                }

                //两种写法是一样的
                /*
                 if (a[j+1] < a[j]) {
                    //the right one < the left one
                    //j:3 j+1:2
                    int tempVariable = a[j+1];
                    //temp = 2
                    a[j+1] = a[j];
                    //j:3 j+1:3
                    a[j] = tempVariable;
                    //j+1:3
                }
                 */
            }
        }
        return a;
    }
}
