// Truth table for && operator
 // true && true = true
 // true && false = false
 // false && false = false
 // false && true = false

public class Main {
    public static void main(String[] args) {
        // your code here
        
		boolean isTrue = true;
        boolean isFalse = false;
        
        System.out.println("Truth Table for &&: ");
        System.out.println(isTrue && isTrue); // returns true
        System.out.println(isTrue && isFalse); // returns false
        System.out.println(isFalse && isFalse); // returns false
        System.out.println(isFalse && isTrue); // returns false

        System.out.println("===================");

        System.out.println("Truth Table for ||: ");
        System.out.println(isTrue || isTrue); // returns true
        System.out.println(isTrue || isFalse); // returns true
        System.out.println(isFalse || isFalse); // returns false
        System.out.println(isFalse || isTrue); // returns true

    }
}
