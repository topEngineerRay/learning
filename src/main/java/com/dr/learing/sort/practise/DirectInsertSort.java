package com.dr.learing.sort.practise;

public class DirectInsertSort {
    public static void main(String[] args) {
        int a[] = { 3, 2, 34, 35, 5};
        //int sortedArray[] = new int[100];
        for (int i = 1; i < a.length; i++) {
            //依次拿到数组中的元素
            int currentNumber = a[i];
            int sortedArrayLength = i - 1;
            //将数组中的当前元素依次与前面的元素比较，若比某一个大或相等（稳定），则放在他之后一个位置，
            // 小则放在前一个位置,放在前一个位置之后后面的元素必须挨个后移
            //for (int j = 0; j >= 0 && j < sortedArrayLength; j++) {
                // 1<2,什么都不做
                // 1<34，不移动
                //2<34，不移动
                //1<5不移动
                //2<5不移动
                //34>5 此时最关键，要将34其后的所有元素后移一个位置，把 5 插入在34的位置
                while(sortedArrayLength>=0&&currentNumber < a[sortedArrayLength]) {
                    //当前下标为i，所以当前元素前面元素的长度是i-1。但是当前元素前的数组长度必须大于0
                        //只需要处理小的情况（或者大的情况），只需处理一种情况
                        //如果当前Number比较小，则1 ，把较小的放在sortedArray j的位置
                        //a[j - 1] = currentNumber;
                        //依次移位
                        a[sortedArrayLength + 1] = a[sortedArrayLength];
                        sortedArrayLength--;
                }
                //如果是当前最大的
            a[sortedArrayLength + 1] = currentNumber;
            //}
        }

        for (int i : a) {
            System.out.println(i);
        }
    }

    private void solution2(int[] a) {
        int array[] = { 1, 2, 34, 5 };
        int sentinel, j;
        for (int i = 1; i < array.length; i++) {
            j = i - 1;
            sentinel = array[i];//哨兵位
            while (j >= 0 && sentinel < array[j]) {
                array[j + 1] = array[j];//将大于sentinel的值整体后移一个单位
                j--;
            }
            array[j + 1] = sentinel;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
