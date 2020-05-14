package defination;

import adt.StackADT;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> implements StackADT<E> {
    private final List<E> data;

    public MyStack() {
        data = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
