public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch =(char) (ch + 32);
            return ch;
        }
        else {
            return ch;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
            return ch;
        }
        else {
            return ch;
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    //for loop that goes thorugh string one by one?
    public static String removeNumbers(String str) {
        String empt = "";
        for (int i = 0; i < str.length(); i++){
            char y = str.charAt(i);
            if (y < '0' || y > '9') {
                empt = empt + y;
            }
        }
        return empt;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toLower('j'));
        System.out.println(toUpper('P'));
        System.out.println(removeNumbers("he11ll0o wo%$r8l*3d"));
    }
}
