package euclideanAlqoritm;

public class EuclideanExample {
    static  int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int a=gcd(15,10);
        System.out.println(a);
    }




}
