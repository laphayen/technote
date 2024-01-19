package test;

public class Example {
    public static void main(String[] args) {
    	String name1 = "tistory";
    	String name2 = "tistory";
    	String name3 = new String("tistory");
    	
    	System.out.println(name1 == name2);		  // true
    	System.out.println(name1 == name3);		  // false
    	System.out.println(name1.equals(name3));  // true
    }
}