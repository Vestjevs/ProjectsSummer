package Book.Implements;



public class Backwords {
    String str;

    Backwords(String s) {
        str = s;
    }

    void backword(int id) {
        if (id != str.length()) backword((id + 1));
        System.out.println(str.charAt(id));
    }

}
