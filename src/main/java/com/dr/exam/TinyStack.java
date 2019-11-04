package com.dr.exam;

/*
    LIFO ＝ last in first out
    后进先出原则
 */
public class TinyStack {

    private int array[];
    private int stackTopPosition;
    private int length;

    //constructor
    public TinyStack(int length){
        stackTopPosition = -1;//if defined 0,then need to adapt relatively
        array = new int[length];
        this.length =length;
    }
    public int pop(){
        //栈顶元素出栈
        if(isStackEmpty()){
            //
            System.out.print("stack is empty");
            throw new RuntimeException("empty stack") ;
        }
        int temp = array[stackTopPosition];
        stackTopPosition--;
        System.out.println(temp+"pop out from stack");
        return temp;
    }
    public void push(int i){
        //入栈
        if(ensureSize()){
            System.out.print("stack is already full");
            return ;
        }
        stackTopPosition++;//下标后移一位
        array[stackTopPosition] = i;//入栈
        System.out.println(i+"pushed into stack");
    }
    //判断栈是否已满
    private boolean ensureSize(){
        return stackTopPosition ==length-1;
    }
    //判断栈是否为空
    private boolean isStackEmpty(){
        return stackTopPosition ==-1;
    }
}
