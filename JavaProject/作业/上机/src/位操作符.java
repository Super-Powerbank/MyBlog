public class 位操作符 {
    public static void main(String[] args) {
        String s =Integer.toBinaryString(45);
        System.out.println(s);//101101
        int n =45;
        //a 去掉最后一位
        String s1=Integer.toBinaryString(n>>1);//10110
        System.out.println(s1);

        //b 在最后一位加0
        System.out.println(Integer.toBinaryString(n<<1));//1011010

        //c 在最后一位加1
        System.out.println(Integer.toBinaryString((n<<1)+1));//1011011

        //d 把最后一位变成0
        System.out.println(Integer.toBinaryString((n|1)-1));//101100

        //e 把最后一位变为1
        System.out.println(Integer.toBinaryString(n|1));//101101

        //f 最后一位取反
        System.out.println(Integer.toBinaryString(n^1));//101100

        //g  k=3 右数第k位变为0
        System.out.println(Integer.toBinaryString(n&~(1<<(3-1))));//101001

        //h  k=2 右数第k位变为1
        System.out.println(Integer.toBinaryString(n|(1<<(2-1))));//101111

        //i k=2 右数第k位取反
        System.out.println(Integer.toBinaryString(n^(1<<(2-1))));//101111

        //j 取右数第k位 k=3
        System.out.println(Integer.toBinaryString(n&(1<<3-1)));//100

        // k.	去末三位
        System.out.println(Integer.toBinaryString(n&7));//101

        //l.	取末k位 k=3
        System.out.println(Integer.toBinaryString(n>>(2-1)&1));//0

        //m.	把末k位变为1 k=2
        System.out.println(Integer.toBinaryString(n|(1<<2-1)));//101111

        //n.	末k位取反 k=3
        System.out.println(Integer.toBinaryString(n^(1<<3-1)));//101001

        //o.	把右边连续的1变成0
        System.out.println(Integer.toBinaryString(n&(n+1)));//101101

        //p.	把右起第一个0变为1
        System.out.println(Integer.toBinaryString(n|(n+1)));//101111

        //q.	把右边连续的0变为1
        System.out.println(Integer.toBinaryString(1|(n-1)));//101101
    }
}
