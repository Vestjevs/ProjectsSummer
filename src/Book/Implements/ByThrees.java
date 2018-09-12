package Book.Implements;

import Book.Interfaces.Series;

import java.util.Set;

public class ByThrees implements Series {
    int start;
    int value;

    ByThrees() {
        start = 0;
        value = 0;
    }

    @Override
    public int getNext() {
        value += 3;
        return value;
    }

    @Override
    public void reset() {
        start = 0;
        value = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        value = x;

    }
}
