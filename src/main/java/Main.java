// Truth table for && operator
 // true && true = true
 // true && false = false
 // false && false = false
 // false && true = false

public class Main {
    public static void main(String[] args) {
        // your code here
        
		boolean areYouHungry = true;
        boolean areyouThirsty = false;
        boolean areYouSleepy = true;
        boolean areYouSad = false;
        
        System.out.println(areYouHungry && areYouSleepy);
        System.out.println(areYouHungry && areyouThirsty);
        System.out.println(areyouThirsty && areYouSad);
        System.out.println(areyouThirsty && areYouSleepy);

    }
}
