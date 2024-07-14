package bitwiseOperations;

public class BitwiseOperations {
    public static void main(String[] args) {
        System.out.println(51 & 25); //17
        System.out.println(51 | 25); //59
        System.out.println(51 ^ 25); //42
        System.out.println(~23); //-24
        System.out.println(12 << 2);//48
        System.out.println(12 >> 2);//3
        operations(10,13);


    }

    public static void operations(int a,int b) {
        System.out.println("first result a="+a);
        System.out.println("first result b="+b);
//        a=5;//  0101
//        b=2; // 0010
        a=a^b;//0111
        b=a^b;//0101
        a=a^b;//0010
        System.out.println("last result a="+a);
        System.out.println("last result b="+b);



    }
}
