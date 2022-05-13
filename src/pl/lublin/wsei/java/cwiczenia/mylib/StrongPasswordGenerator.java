package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Random;

public class StrongPasswordGenerator {
    private int dlugosc;
    private boolean maleLitery;
    private boolean wielkieLitery;
    private boolean cyfry;
    private boolean znakiSpecjalne;
    private String dozwoloneZnakiSpecjalne;

    private static String maleList = "qwertyuiopasdfghjklzxcvbnm";
    private static String wielkieList = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static String cyfryList = "1234567890";

    public StrongPasswordGenerator() {
        this.dlugosc = 8;
        this.maleLitery = true;
        this.wielkieLitery = true;
        this.cyfry = true;
        this.znakiSpecjalne = false;
        this.dozwoloneZnakiSpecjalne = "~`!@#$^&*-_=+;:,./?";
    }
    public StrongPasswordGenerator(int dlugosc) {
        this.dlugosc = dlugosc;
        this.maleLitery = true;
        this.wielkieLitery = true;
        this.cyfry = true;
        this.znakiSpecjalne = false;
        this.dozwoloneZnakiSpecjalne = "~`!@#$^&*-_=+;:,./?";
    }
    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = false;
        this.dozwoloneZnakiSpecjalne = "~`!@#$^&*-_=+;:,./?";
    }
    public StrongPasswordGenerator(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        this.dlugosc = dlugosc;
        this.maleLitery = maleLitery;
        this.wielkieLitery = wielkieLitery;
        this.cyfry = cyfry;
        this.znakiSpecjalne = znakiSpecjalne;
        this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;
    }

    public void setDlugosc(int dlugosc) {this.dlugosc = dlugosc;}
    public void setMaleLitery(boolean maleLitery) {this.maleLitery = maleLitery;}
    public void setWielkieLitery(boolean wielkieLitery) {this.wielkieLitery = wielkieLitery;}
    public void setCyfry(boolean cyfry) {this.cyfry = cyfry;}
    public void setZnakiSpecjalne(boolean znakiSpecjalne) {this.znakiSpecjalne = znakiSpecjalne;}
    public void setDozwoloneZnakiSpecjalne(String dozwoloneZnakiSpecjalne) {this.dozwoloneZnakiSpecjalne = dozwoloneZnakiSpecjalne;}

    public int getDlugosc() {return dlugosc;}
    public boolean getMaleLitery() {return maleLitery;}
    public boolean getWielkieLitery() {return wielkieLitery;}
    public boolean getCyfry() {return cyfry;}
    public boolean getZnakiSpecjalne() {return znakiSpecjalne;}
    public String getDozwoloneZnakiSpecjalne() {return dozwoloneZnakiSpecjalne;}



    public String generate() {
        String haslo = "";
        String fullLib = "";
        Random rnd = new Random();

        if (this.maleLitery)  {
            haslo += maleList.charAt(rnd.nextInt(maleList.length()));
            fullLib += maleList;
        }
        if (this.wielkieLitery)  {
            haslo += wielkieList.charAt(rnd.nextInt(wielkieList.length()));
            fullLib += wielkieList;
        }
        if (this.cyfry)  {
            haslo += cyfryList.charAt(rnd.nextInt(cyfryList.length()));
            fullLib += cyfryList;
        }
        if (this.znakiSpecjalne) {
            haslo += this.dozwoloneZnakiSpecjalne.charAt(rnd.nextInt(this.dozwoloneZnakiSpecjalne.length()));
            fullLib += this.dozwoloneZnakiSpecjalne;
        }

        for(int i = 4; i < this.dlugosc; i++) {
            haslo += fullLib.charAt(rnd.nextInt(fullLib.length()));
        }
        haslo = StringFun.shuffle(haslo);
        return haslo;
    }
}
