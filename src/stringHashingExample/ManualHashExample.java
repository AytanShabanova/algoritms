package stringHashingExample;

public class ManualHashExample {

    public long manualHash(String str) {
        long hash=0;
        int prime=31;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash=hash*prime + ch;


        }
        return hash;
    }
    public static void main(String[] args) {
        System.out.println(new ManualHashExample().manualHash("HelloWorld"));
    }



}
