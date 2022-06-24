public class Main {
    
    public static void main(String[] args) {
        
        // your code here
        boolean[][] truthMatrix = { {true,true},{true,false},
                                    {false,false},{false,true} };
        
        System.out.println("Truth table for && operator: ");
        for (boolean[] b : truthMatrix) {
            System.out.println(b[0] + " && " + b[1] + " = " + (b[0] && b[1]));
        }

        System.out.println("============================");

        System.out.println("Truth table for || operator: ");
        for (boolean[] b : truthMatrix) {
            System.out.println(b[0] + " || " + b[1] + " = " + (b[0] || b[1]));
        }

    }

}