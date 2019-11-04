package com.dr.learing.sort.practise;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 6, 1, 2, 1, 134, 5, };
        int b[] = { 6, 1, 2, 1, 134, 5, };
        //从左至右依次比较两个相邻元素，每一次把最大的移到最后，稳定
        //这个写法有问题
        /*for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    //the right one < the left one
                    //i:3 j:2
                    int i1 = a[i];
                    //i1 = 3
                    a[i] = a[j];
                    //i:2 j:2
                    a[j] = i1;
                    //j:3
                }
            }
        }*/

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
                    //the right one < the left one
                    //j:3 j+1:2
                    int tempVariable = a[j];
                    //i1 = 3
                    a[j] = a[j+1];
                    //j:2 j+1:2
                    a[j+1] = tempVariable;
                    //j+1:3
                }
                //两种写法是一样的，只需要画出内存图就可以很好的理解了
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
