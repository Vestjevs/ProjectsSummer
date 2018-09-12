package Book.Implements;

import Book.Interfaces.Series;

public class ByTwos implements Series {
    private int start;
    private int value;
    private int previous;

    ByTwos() {
        start = 0;
        value = 0;
    }

    @Override
    public int getNext() {
        previous = value;
        value += 2;
        return value;
    }

    @Override
    public void reset() {
        start = 0;
        value = 0;
        previous = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        value = x;
        previous = x - 2;
    }

    int getPrevious() {
        return previous;
    }
}
