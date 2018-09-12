package Book.Interfaces;


import java.util.stream.IntStream;

public interface Series {

    int getNext(); //

    void reset(); //

    void setStart(int x); // set started value

    default int[] getNextArray(int n) {
        int[] values = IntStream.range(0, n).map(i -> getNext()).toArray();
        return values;

    }

}
