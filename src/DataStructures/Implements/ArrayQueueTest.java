package DataStructures.Implements;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runners.JUnit4;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {
    ArrayQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new ArrayQueue<>(10);
    }

    @AfterEach
    void tearDown() {
        queue = null;
    }

    @Test
    void peek() {
//        try {
//            queue.peek();
//        }catch (NoSuchElementException exc){
//            System.out.println(exc);
//        }
        queue.add(10);
        assertEquals((Object) 10, queue.peek());
        queue.add(11);
        assertEquals((Object) 10, queue.pop());
        assertEquals((Object) 11, queue.peek());
    }

    @Test
    void pop() {
//        try {
//            queue.pop();
//        }catch (NoSuchElementException exc){
//            System.out.println(exc);
//        }
//        queue.add(10);
//        assertEquals(1, queue.size());
//        queue.pop();
//        assertEquals(0, queue.size());
        queue.add(10);
        queue.add(11);
        queue.add(12);
        assertEquals((Object) 10, queue.pop());
        assertEquals((Object) 11, queue.pop());
        assertEquals((Object) 12, queue.pop());
    }

    @Test
    void isEmpty() {
        assertEquals(true, queue.isEmpty());
        queue.add(1);
        assertEquals(false, queue.isEmpty());

    }

    @Test
    void size() {
        assertEquals(0, queue.size());
        queue.add(1);
        assertEquals(1, queue.size());
        queue.add(2);
        assertEquals(2, queue.size());
    }

    @Test()
    void add() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.add(i);
            }
        } catch (RuntimeException exc) {
            System.out.println(exc);
        }
    }

    public static void main(String[] args) {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(ArrayQueueTest.class);
    }
}