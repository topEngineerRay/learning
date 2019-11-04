package com.dr.leetcode.medium;

//Definition for singly-linked list.

//[2,4,3]
//[5,6,4]
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //2+5 =7,4+6=0;3+4=7
        //
        //for(int i=0;i<l1.size();i++){
        ListNode list = null;
        //the first number
        if (l1.next != null && l2.next != null) {
            ListNode l11 = l1.next;
            ListNode l22 = l2.next;

            int number = (l1.val + l2.val) % 10;
            //int currentNumber = (l1.next.val + l2.next.val) % 10;
            int preNumber = (l1.next.val + l2.next.val) / 10;
            //plus current result and the next result
            list = new ListNode(number + preNumber);
            //list.next=list;
            if (l1.next.next != null && l2.next.next != null) {
                list.next = addTwoNumbers(l1.next, l2.next);
            }

        }else{
            int number = (l1.val + l2.val) % 10;
            //int currentNumber = (l1.next.val + l2.next.val) % 10;

            list = new ListNode(number);
            //list.next=list;
            if (l1.next.next != null && l2.next.next != null) {
                list.next = addTwoNumbers(l1.next, l2.next);
            }
        }


        return list;
    }
   /*
   //solution1
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //2+5 =7,4+6=0,go next;3+4=7
        ListNode list = null;
        //the first number
        if(l1.next!=null&&l2.next!=null) {
            int number = (l1.val + l2.val) % 10;//18 % 10 = 8
            //int currentNumber = (l1.next.val + l2.next.val) % 10;
            int preNumber = (l1.next.val + l2.next.val) / 10;
            //plus current result and the next result
            list = new ListNode(number+preNumber);
            //list.next=list;
            list.next=addTwoNumbers(l1.next, l2.next);
        }
        else{
            int number = (l1.val + l2.val) % 10;
            //must be the last one , cant call list.next
            list = new ListNode(number);
        }
        return list;
    }
   */
   /*  这个版本提交到了leetcode
   //solution 2, 往后进位
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //2+5 =7,4+6=0,go next;3+4=7
       //the first number
       if(l1 == null ){
            return l2;
        }else if(l2 == null ) {
            return l1;
        }else{
           //if(l1.val!= 0 &&l2.val!=0 ) {
            int number = (l1.val + l2.val) % 10;//18 % 10 = 8
            //int currentNumber = (l1.next.val + l2.next.val) % 10;
            int preNumber = (l1.val + l2.val) / 10;
            //plus current result and the next result
            ListNode list = new ListNode(number);
            //list.next=list;
            list.next=addTwoNumbers(l1.next, l2.next);
            if(preNumber==1)
            list.next=addTwoNumbers(list.next, new ListNode(1));//?
            return list;
        }
   }
    */
   /*

   public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
        {
        if(l1==null)return l2;
            else if(l2==null) return l1;
             else {
        int val = l1.val+l2.val>=10?l1.val+l2.val-10:l1.val+l2.val;
            ListNode result = new ListNode(val);
            result.next = addTwoNumbers(l1.next,l2.next);
            if(l1.val+l2.val>=10)
                result.next = addTwoNumbers(result.next,new ListNode(1));
                return result;
        }
}
    */
    //digui
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


}


