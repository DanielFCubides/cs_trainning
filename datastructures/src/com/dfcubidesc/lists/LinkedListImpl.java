package com.dfcubidesc.lists;

public class LinkedListImpl<T> implements List<T> {

  Node head; // head of list

  private void insert(T data) {
    // Create a new node with given data
    Node new_node = new Node(data);
    new_node.next = null;

    // If the Linked List is empty,
    // then make the new node as head
    if (this.head == null) {
      this.head = new_node;
    } else {
      // Else traverse till the last node
      // and insert the new_node there
      Node last = this.head;
      while (last.next != null) {
        last = last.next;
      }

      // Insert the new_node at last node
      last.next = new_node;
    }
  }

  // **************TRAVERSAL**************

  // Method to print the LinkedList.
  public void printList() {
    Node currNode = this.head;

    System.out.print("\nLinkedList: ");

    // Traverse through the LinkedList
    while (currNode != null) {
      // Print the data at current node
      System.out.print(currNode.data + " ");

      // Go to next node
      currNode = currNode.next;
    }
    System.out.println("\n");
  }

  private T deleteAtPosition(int index) {
    Node currNode = this.head, prev = null;

    if (index == 0 && currNode != null) {
      this.head = currNode.next;
      System.out.println(index + " position element deleted");
      return currNode.data;
    }
    int counter = 0;
    while (currNode != null) {

      if (counter == index) {
        prev.next = currNode.next;
        System.out.println(index + " position element deleted");
        break;
      } else {
        prev = currNode;
        currNode = currNode.next;
        counter++;
      }
    }
    if (currNode == null) {
      System.out.println(index + " position element not found");
    }
    return currNode.data;
  }

  @Override
  public T get(int index) {
    return null;
  }

  @Override
  public void add(T item) {
    insert(item);
  }

  @Override
  public void add(T item, int index) {

  }

  @Override
  public T remove(int index) {
    return deleteAtPosition(index);
  }

  class Node {

    T data;
    Node next;

    Node(T d) {
      data = d;
    }
  }
}
