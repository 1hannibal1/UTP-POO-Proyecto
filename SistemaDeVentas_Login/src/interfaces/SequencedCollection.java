/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.Collection;

/**
 *
 * @author LAB-USR-SJL
 */
interface SequencedCollection<E> extends Collection<E>{
    E getFirst();
    E getLast();
    void addFirst(E e);
    E removeFirst();
}
