public class ReverseString {

    static String reverseString(String s){

        return "";  // placeholder
    }


    public static void main(String[] args) throws Exception {
        System.out.println("===== Testing reverseString =====\n");

        String test1 = "hello";
        System.out.println("Input: " + test1);
        System.out.println("Expected: olleh");
        System.out.println("Actual:   " + reverseString(test1));
        System.out.println();
    
        String test2 = "recursion";
        System.out.println("Input: " + test2);
        System.out.println("Expected: noisrucer");
        System.out.println("Actual:   " + reverseString(test2));
        System.out.println();
    
        String test3 = "a";
        System.out.println("Input: " + test3);
        System.out.println("Expected: a");
        System.out.println("Actual:   " + reverseString(test3));
        System.out.println();
    
        String test4 = "";
        System.out.println("Input: (empty string)");
        System.out.println("Expected: ");
        System.out.println("Actual:   " + reverseString(test4));
        System.out.println();
    
        String test5 = "Hello World";
        System.out.println("Input: " + test5);
        System.out.println("Expected: dlroW olleH");
        System.out.println("Actual:   " + reverseString(test5));
        System.out.println();
    }
}

