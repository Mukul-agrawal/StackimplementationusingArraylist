package defination;

import adt.StackADT;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack<E> implements StackADT<E> {
    private final List<E> data;

    public MyStack() {
        data = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        data.add(obj);
        return obj;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return data.get(data.size() - 1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return data.remove(data.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
