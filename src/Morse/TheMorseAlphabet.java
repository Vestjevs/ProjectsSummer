package Morse;

public class TheMorseAlphabet {
    String str;
    private String msg = " ";

    private String[] alphaMor = {".-", "-...", "-.-.",
            "-..", ".", "..-.",
            "--.", "....", "..",
            ".---", "-.-", ".-..",
            "--", "-.", "---",
            ".--.", "--.-", ".-.",
            "...", "-", "..-",
            "...-", ".--", "-..-",
            "-.--", "--.."};
    private char[] arrayOfABC = new char[26];

    TheMorseAlphabet(String s) {
        init();
        str = s;
    }

    void init() {
        for (int i = 0; i < arrayOfABC.length; i++) {
            arrayOfABC[i] = (char) ('A' + i);
        }
    }


    String ChangeToMorse() {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arrayOfABC.length; j++) {
                if (str.charAt(i) == arrayOfABC[j] && str.charAt(i) != ' ') {
                    msg = String.format("%s%s", msg, alphaMor[j]);
                }
            }
        }
        return msg;
    }

}
