package com.dr.Algorithm;

public class JavaSyntax {
    public static void main(String[] args){

        //caculate();
        //selfAdd();
        //binaryCompute();
        shiftOperation();
    }
    private static void shiftOperation(){
        // <<      :     左移运算符，num << 1,相当于num乘以2
        //	按位左移运算符。左操作数按位左移右操作数指定的位数。A << 2得到240，即 1111 0000
        // >>      :     右移运算符，num >> 1,相当于num除以2
        // >>>     :     无符号右移，忽略符号位，空位都以0补齐
        int i = 16;
        int j =1;
        System.out.println(i>>32);//16 /
        System.out.println(i>>2);
        System.out.println(i>>33);
        System.out.println(i<<33);
        System.out.println(j<<8);
        //通常我们都把m>>n理解为当前值m除以2的n次方，
        // 同理<<是乘，但我们注意到当某一个数>>32时，
        // 结果是它本身，原因就在于位移操作符右边的参数要先进行模32的运算。
        //例如上述的i>>2，实际上 temp = 2%32 = 2;
        // i / temp^2; 那么 i>>32就是，temp = 32%32 = 0,   i / temp^0 .
    }
    private static void caculate(){
        //System.out.println(5/2);//5除以2等于2余数1，返回值是2
        //System.out.println(5%2);//5除以2等于2余数1，返回值是1
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }
    private static void selfAdd(){
        int a = 3;//定义一个变量；
        int b = ++a;//自增运算
        int c = 3;
        int d = --c;//自减运算
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println("进行自减运算后的值等于"+d);
    }
    private static void binaryCompute(){
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        //java抑或运算符，执行速度非常快 i^j ，帮i和j转换成二进制做抑或运算，运算规则是相同为0，不同为1
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
    private void logicCompute(){
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        int c = 5;//定义一个变量；
        boolean d = (c<4)&&(c++<10);
        System.out.println("使用短路逻辑运算符的结果为"+d);
        System.out.println("c的结果为"+c);
    }
    private static void valueAssignment(){
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= a = " + c );
        c &= a ;
        System.out.println("c &= 2  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );
    }
    private static void condition(){
        int a , b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b );
    }
}
