package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

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
    public static String camelize(String input) {
        String inputLower = input.toLowerCase();
        inputLower = StringUtils.normalizeSpace(inputLower);
        String[] parts = StringUtils.split(inputLower);
        for(int i=1; i < parts.length; i++) {
            parts[i] = StringUtils.capitalize(parts[i]);
        }
        String output = StringUtils.join(parts);

        return output;
    }
    public static String decamelize(String input, int version) {
        String output = "";
        if (version ==1) {                      //wersja z przepisywaniem pojedynczych liter
            for (int i = 0; i < input.length(); i++) {
                if (Character.isUpperCase(input.charAt(i))) {
                    output += ' ';
                }
                output += input.charAt(i);
            }
        } else {                                //wersja z przepisywaniem słow za pomocą indeksów
            int startindex = 0, endindex;
            for (int i = 0; i < input.length(); i++) {
                if (Character.isUpperCase(input.charAt(i))) {
                    endindex = i;
                    output += StringUtils.substring(input, startindex, endindex);
                    output += ' ';
                    startindex = i;
                }
            }
            output += StringUtils.substring(input, startindex);
        }

        output = output.toLowerCase();
        return output;
    }
}
