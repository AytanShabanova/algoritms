package binaryExponentationExample;

public class BinaryExponentationRecursiveExample {
    public static void main(String[] args) {


        System.out.println("birinci main  "+Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        long c=   binaryExponent(2,6);
        System.out.println(c);
    }
    public static long binaryExponent(long a, long exponent) {
        if (exponent==0){
            System.out.println("birinci if "+Thread.currentThread().getName());
            System.out.println(Thread.activeCount());
            return 1;

        } else if (exponent %2==1) {
            System.out.println("ikinci  if "+Thread.currentThread().getName());
            System.out.println(Thread.activeCount());
            return a* binaryExponent(a,exponent-1);

        } else  if (exponent %2==0) {
            System.out.println("ucuncu if "+Thread.currentThread().getName());
            System.out.println(Thread.activeCount());
            long b= binaryExponent(a,exponent/2);
            return b*b;
        }
        return 0;

    }




}
