package com.dr.learing.javaBasic;

public class StackImplement {

    public static void main(String[] args){
        MyStack stack = new MyStack();
        stack.push("11");
        stack.push("22");
        Object object = stack.pop();
        System.out.println(object);

        Object object1 = stack.pop();
        System.out.println(object1);

    }

    private static class MyStack<T>{
        private int depth = 10;

        protected int currentDepth = 0;

        //int 类型的数组
        //private int[] stack = new int[depth];

        //object 类型的数组
        private Object[] stack = new Object[depth];

        //pop out from a stack
        private Object pop(){
            if(currentDepth==0){
                throw new RuntimeException("the stack is already empty.");
            }

            return stack[currentDepth];
        }

        //push into stack
        public void push(Object object){
            if (currentDepth == depth - 1) {
                throw new RuntimeException("the stack is already full.");
            }

            stack[currentDepth++]=object;

            //currentDepth++;
        }
    }

}
