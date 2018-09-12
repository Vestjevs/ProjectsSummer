package DataStructures.Implements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    ArrayList<Integer> list;

    @BeforeEach
    void init(){
        list = new ArrayList<>(10);
    }
    @AfterEach
    void tearDown(){
        list = null;
    }

    @Test
    void insert() {
    }

    @Test
    void get() {
    }

    @Test
    void remove() {
    }

    @Test
    void find() {
    }

    @Test
    void isEmpty() {
        assertEquals(0, list.size());
    }

    @Test
    void size() {
        list.add(2);
        list.add(12);
        assertEquals(2, list.size());
    }

    @Test
    void add() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        assertEquals(10, list.size());
    }

    @Test
    void iterator() {
    }
}