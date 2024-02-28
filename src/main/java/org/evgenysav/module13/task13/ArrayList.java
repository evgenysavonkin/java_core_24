package org.evgenysav.module13.task13;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public final class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(int initCapacity) {
        this.elements = new Object[initCapacity];
    }

    public ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E e) {
        if (e == null) {
            throw new IllegalArgumentException("An argument can't be null");
        }

        if (size == elements.length - 1) {
            grow();
        }

        elements[size] = e;
        size++;
        return true;
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index <= size - 1) {
            Object e = elements[index];
            elements[index] = null;
            if (index == --size) {
                return (E) e;
            }

            removeNullByMovingValues(index);
            return (E) e;
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }

    @Override
    public E set(int index, E element) {
        if (index >= 0 && index <= size - 1) {
            E oldValue = (E) elements[index];
            elements[index] = element;
            return oldValue;
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index <= size - 1) {
            return (E) elements[index];
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }

    @Override
    public int size() {
        return size;
    }

    private void removeNullByMovingValues(int index) {
        final int newSize = size;
        System.arraycopy(elements, index + 1, elements, index, newSize - index);
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity * 3 / 2 + 1;
        Object[] dest = new Object[newCapacity];
        System.arraycopy(elements, 0, dest, 0, oldCapacity);
        elements = dest.clone();
    }
}
