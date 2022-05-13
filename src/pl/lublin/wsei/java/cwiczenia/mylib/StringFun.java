package pl.lublin.wsei.java.cwiczenia.mylib;

public class StringFun {
    public static String anarchize(String input) {
        String output = "";
        boolean isFirstUpper = Character.isUpperCase(input.charAt(0));

        for(int i=0; i < input.length(); i++) {
            if (isFirstUpper) {
                if (i%2 == 0) {
                    output += Character.toLowerCase(input.charAt(i));
                } else {
                    output += Character.toUpperCase(input.charAt(i));
                }
            } else {
                if (i%2 == 0) {
                    output += Character.toUpperCase(input.charAt(i));
                } else {
                    output += Character.toLowerCase(input.charAt(i));
                }
            }
        }
        return output;
    }
}
