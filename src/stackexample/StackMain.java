package stackexample;

public class StackMain {
    public static void main(String[] args) {
        String s1="[{}]";
        String s2="({])";
 StackExample stackExample=new StackExample();
        System.out.println(stackExample.stackMethod(s1));
        System.out.println(stackExample.stackMethod(s2));
    }
}
