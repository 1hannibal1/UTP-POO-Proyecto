/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 *
 * @author LAB-USR-SJL
 */
public class CollectionCustom<E> 
        implements SequencedCollection<E> {
    
    private LinkedList<E> collection;

    public CollectionCustom() {
        this.collection = new LinkedList<>();
    }
    
    @Override
    public E getFirst() {
        return collection.isEmpty() ? null : collection.getFirst();
    }

    @Override
    public E getLast() {
        return collection.isEmpty() ? null : collection.getLast();
    }

    @Override
    public void addFirst(E e) {
        collection.addFirst(e);
    }

    @Override
    public E removeFirst() {
        return collection.isEmpty() ? null : collection.removeFirst();
    }

    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public boolean isEmpty() {
        return collection.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return collection.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return collection.iterator();
    }

    @Override
    public Object[] toArray() {
        return collection.toArray();
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return collection.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return collection.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return collection.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return collection.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return collection.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return collection.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return collection.retainAll(c);
    }

    @Override
    public void clear() {
        collection.clear();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        collection.forEach(action);
    }
    
}
