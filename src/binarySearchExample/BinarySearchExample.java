package binarySearchExample;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr={1,3,5,10,12,15};
        int x=5;
        System.out.println(binarySearch(arr, x));
    }




   static boolean  binarySearch(int arr [],int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==x){

                return true;

            } if(arr[m]<x){
             l=m+1;
               continue;
            }
            if(arr[m]>x){
                r=m-1;

                continue;
            }

        }
        return false;

    }
}
