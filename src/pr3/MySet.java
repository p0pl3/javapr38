package pr3;

import java.util.*;

public class MySet<E> implements Set<E> {
    private HashSet<E> set;

    public MySet() {
        this.set = new HashSet<>();
    }


    @Override
    public synchronized int size() {
        return set.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public synchronized Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return set.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public synchronized boolean add(E e) {
        for (int i = 0; i < 10; i++)
            System.out.print(i + " ");
        System.out.println();
        return set.add(e);
    }

    @Override
    public synchronized boolean remove(Object o) {
        for (int i = 10; i < 20; i++)
            System.out.print(i + " ");
        System.out.println();
        return set.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        return set.contains(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends E> c) {
        return set.addAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        return retainAll(c);
    }

    @Override
    public synchronized void clear() {
        set.clear();
    }
}
