package org.evgenysav.module13.task13;

import org.w3c.dom.ls.LSOutput;

import java.util.AbstractList;
import java.util.List;

public final class LinkedList<E> extends AbstractList<E> implements List<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    public LinkedList() {

    }

    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> prev;

        private Node(E value, Node<E> next, Node<E> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    @Override
    public E get(int index) {
        System.out.println("index " + index);
        if (index >= 0 && index <= size - 1) {
            if (index < size / 2) {
                Node<E> x = first;
                for (int i = 0; i < index; i++) {
                    x = x.next;
                }

                return x.value;
            } else {
                Node<E> x = last;
                for (int i = size - 1; i > index; i--) {
                    x = x.prev;
                }

                return x.value;
            }
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }

    @Override
    public E set(int index, E element) {
        if (element == null) {
            throw new NullPointerException("An argument can't be null");
        }
        if (index >= 0 && index <= size - 1) {
            Node<E> node = getNode(index);
            E oldValue = node.value;
            node.value = element;
            return oldValue;
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }

    @Override
    public boolean add(E e) {
        if (e == null) {
            throw new NullPointerException("An argument can't be null");
        }

        if (size == 0) {
            Node<E> node = new Node<>(e, null, null);
            first = node;
            last = node;
            size++;
            return true;
        }

        Node<E> node = new Node<>(e, null, last);
        last.next = node;
        last = node;
        size++;

        return true;
    }

    @Override
    public E remove(int index) {
        Node<E> nodeToRemove = getNode(index);
        E valueToReturn = nodeToRemove.value;
        Node<E> nextNode = nodeToRemove.next;
        Node<E> prevNode = nodeToRemove.prev;

        if (prevNode == null) {
            first = nextNode;
        } else {
            prevNode.next = nextNode;
            nodeToRemove.prev = null;
        }

        if (nextNode == null) {
            last = prevNode;
        } else {
            nextNode.prev = prevNode;
            nodeToRemove.next = null;
        }

        nodeToRemove.value = null;
        size--;

        return valueToReturn;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<E> getNode(int index) {
        if (index >= 0 && index <= size - 1) {
            if (index < size / 2) {
                Node<E> x = first;
                for (int i = 0; i < index; i++) {
                    x = x.next;
                }

                return x;
            } else {
                Node<E> x = last;
                for (int i = size - 1; i > index; i--) {
                    x = x.prev;
                }

                return x;
            }
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }
}
