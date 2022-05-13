package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import static java.sql.Types.NULL;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};
/*
    public void setName(String name) {      // setName z wbudowaną kapitalizacją
        String[] tokens = StringUtils.split(name);
        for(int i=0; i < tokens.length; i++) {
            tokens[i] = StringUtils.capitalize(tokens[i]);
        }
        this.name = StringUtils.join(tokens, ' ');

    }
 */

    public static String capitalize(String aStr) {      //oddzielna kapitalizacja
        String[] tokens = StringUtils.split(aStr);
        for(int i=0; i < tokens.length; i++) {
            tokens[i] = StringUtils.capitalize(tokens[i]);
        }
        return StringUtils.join(tokens, ' ');
    }
    public void setName (String name) {
        this.name = translit(name);
        this.name = capitalize(this.name);
    }
    public String getName() {
        return name;
    }
    public static String translit(String arg) {
        String argLower = arg.toLowerCase();
        int index = NULL;
        String output = "";
        for(int i = 0; i < argLower.length(); i++) {
            index = NULL;
            try {
                index = StringUtils.indexOf(ukrAlphabet, argLower.charAt(i));
                output += translitRepl[index];
            } catch (Exception e) {
                output += argLower.charAt(i);
            }

        }
        return output;
    }
}
