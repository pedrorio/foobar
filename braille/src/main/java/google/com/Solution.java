package google.com;

import java.util.ArrayList;

public class Solution {

    public static String solution(String plaintext) {
        ArrayList<String> brailleString = new ArrayList<String>();


        for (char ch : plaintext.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                brailleString.add("000001");
            }

            brailleString.add(encode(ch));
        }
        return String.join("", brailleString);
    }

    private static String encode(Character ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
                return "100000";
            case 'b':
                return "110000";
            case 'c':
                return "100100";
            case 'd':
                return "100110";
            case 'e':
                return "100010";
            case 'f':
                return "110100";
            case 'g':
                return "110110";
            case 'h':
                return "110010";
            case 'i':
                return "010100";
            case 'j':
                return "010110";
            case 'k':
                return "101000";
            case 'l':
                return "111000";
            case 'm':
                return "101100";
            case 'n':
                return "101110";
            case 'o':
                return "101010";
            case 'p':
                return "111100";
            case 'q':
                return "111110";
            case 'r':
                return "111010";
            case 's':
                return "011100";
            case 't':
                return "011110";
            case 'u':
                return "101001";
            case 'v':
                return "111001";
            case 'w':
                return "010111";
            case 'x':
                return "101101";
            case 'y':
                return "101111";
            case 'z':
                return "101011";
            default:
                return "000000";
        }
    }
}