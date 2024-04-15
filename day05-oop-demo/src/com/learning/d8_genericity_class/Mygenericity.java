package com.learning.d8_genericity_class;

import java.util.ArrayList;

public class Mygenericity<E> {

    private ArrayList<E> list = new ArrayList<>();
    public void add(E e) {
        list.add(e);
    }

    public void remove(E e) {
        list.remove(e);
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
