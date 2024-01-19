package test;

public class Example {
    public static void main(String[] args) {
        String str = null;
        
        if (str != null) {
            int length = str.length();
        }
        else {
            System.out.print("NullPointerException!");
        }
    }
}