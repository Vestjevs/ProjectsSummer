package DataStructures.Implements;

import DataStructures.Interfaces.IStack;

import java.util.EmptyStackException;

public class ArrayStack<E> implements IStack<E> {
    private E[] elements;
    private int head;

    ArrayStack(int CAPACITY) {
        elements = (E[]) new Object[CAPACITY];
        head = 0;
    }


    ArrayStack(ArrayStack<E> stack) {
        head = stack.head;
        elements = (E[]) stack.elements;
    }

    ArrayStack(E a[]) {
        elements = (E[]) new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                anPush(a[i]);
            } catch (RuntimeException exc) {
                System.out.println(exc);
            }
        }
    }


    private void anPush(E element) {
        try {
            elements[head] = element;
            head++;
        } catch (RuntimeException exc) {
            System.out.println("Stack is full");
        }
    }

    @Override
    public E pop() throws EmptyStackException {

        E var1 = this.peek();
        if (head == 0) {
            throw new EmptyStackException();
        }
        head--;
        return var1;
    }

    @Override
    public E peek() {
        int var1 = this.head;
        if (var1 == 0) {
            throw new EmptyStackException();
        } else {
            return elements[var1 - 1];
        }
    }

    @Override
    public boolean isEmpty() {
        return head == 0;
    }

    @Override
    public int size() {
        return head;
    }

    @Override
    public void add(E element) {
        anPush(element);
    }
}
