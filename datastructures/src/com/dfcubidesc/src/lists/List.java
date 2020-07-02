package com.dfcubidesc.src.lists;

public interface List<T> {

  T get();

  void add(T item);

  void add(T item, int index);

  T remove(int index);

}
