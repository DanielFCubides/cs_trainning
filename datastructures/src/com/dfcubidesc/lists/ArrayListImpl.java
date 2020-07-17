package com.dfcubidesc.lists;

public class ArrayListImpl<T> implements List<T> {

  private static final int CAPACITY = 10;
  private final T[] myList;
  private int size = 0;

  public ArrayListImpl() {
    myList = (T[]) new Object[CAPACITY];
  }

  @Override
  public T get(int index) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
    }
    return myList[index];
  }

  @Override
  public void add(T item) {
    myList[size++] = item;
  }

  @Override
  public void add(T item, int index) {

  }

  @Override
  public T remove(int index) {
    return null;
  }
}
