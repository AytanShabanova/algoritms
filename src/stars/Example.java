package stars;

import com.sun.tools.javac.Main;

public class Example {
    public static void main(String[] args) {
        example5(6,6);
    }




    public static void example1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
    public static void example2(int n){

        for (int i = n; i >=0; i--) {

                for (int j =i; j >0 ; j--) {
                    System.out.print("*");
                }
                System.out.println("*");




        }
    }

   public static void example3(int n,int l){
        for (int i = 0; i <n; i++) {
            for (int j =l; j >0 ; j--) {

                System.out.print(" ");

            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println("*");
           l--;
        }
   }
   public static void example4(int n,int l){
        for (int i = 0; i < n; i++) {
            for(int j=l;j>0;j--){
                System.out.print(" ");

            }
            for(int m=0;m<i;m++){
                System.out.print("*");
                System.out.print(" ");
            }


            System.out.println("*");
            l--;
        }

   }

    public static void example5(int n,int l) {
        for (int i = 0; i < n; i++) {

            for (int j = l; j > 0; j--) {
                System.out.print(" ");


            }
            for (int m = 0; m <= i; m++) {
                System.out.print("*");
                System.out.print(" ");
            }

            for (int k=l;k>0;k--){
                System.out.print(" ");
                System.out.print("*");

            }
            System.out.println("");
            l--;
        }


    }
}
