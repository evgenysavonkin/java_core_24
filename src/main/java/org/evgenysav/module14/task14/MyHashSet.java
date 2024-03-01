package org.evgenysav.module14.task14;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<E> extends AbstractSet<E> implements Set<E> {

    private MyHashMap<E, Object> map;
    private static final Object PRESENT = new Object();
    private static final String NULL_ARGUMENT_MSG = "An argument can't be null";

    public MyHashSet() {
        map = new MyHashMap<>();
    }

    @Override
    public boolean add(E e) {
        if (e == null) {
            throw new NullPointerException(NULL_ARGUMENT_MSG);
        }

        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException(NULL_ARGUMENT_MSG);
        }

        return map.remove(o) == PRESENT;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            throw new NullPointerException(NULL_ARGUMENT_MSG);
        }

        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c)
            if (add(e))
                modified = true;
        return modified;
    }

    @Override
    public int size() {
        return map.size();
    }
}
