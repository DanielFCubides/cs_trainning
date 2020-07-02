package com.dfcubidesc.lists;

public interface List<T> {

  T get(int index);

  void add(T item);

  void add(T item, int index);

  T remove(int index);

}
