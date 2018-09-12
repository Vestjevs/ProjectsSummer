package Book.Implements;



public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block object) {
        if ((object.b == b) & (object.a == a) & (object.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block object) {
        if (object.volume == volume) return true;
        else return false;
    }
}
