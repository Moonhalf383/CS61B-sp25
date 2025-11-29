import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T> {

  private class Node {
    public Node prev;
    public Node next;
    public T item = null;

    public Node(Node n, Node p, T content) {
      next = n;
      prev = p;
      item = content;
    }
  }

  private Node sentinel;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }

  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return super.equals(obj);
  }

  @Override
  protected void finalize() throws Throwable {
    // TODO Auto-generated method stub
    super.finalize();
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

  @Override
  public void addFirst(T x) {
    // TODO Auto-generated method stub
    Node newNode = new Node(sentinel.next, sentinel, x);
    sentinel.next.prev = newNode;
    sentinel.next = newNode;
  }

  @Override
  public void addLast(T x) {
    // TODO Auto-generated method stub
    Node newNode = new Node(sentinel, sentinel.prev, x);
    sentinel.prev.next = newNode;
    sentinel.prev = newNode;
  }

  @Override
  public T get(int index) {
    // TODO Auto-generated method stub
    if (index < 0)
      return null;
    if (index >= size())
      return null;
    int i = 0;
    Node pointer = sentinel.next;
    while (i != index) {
      pointer = pointer.next;
      i += 1;
    }
    return pointer.item;
  }

  @Override
  public T getRecursive(int index) {
    // TODO Auto-generated method stub
    if (index < 0)
      return null;
    if (index >= size())
      return null;
    class getClass {
      T movePointer(int target, Node pointer) {
        if (target == 0)
          return pointer.item;
        return movePointer(target - 1, pointer.next);
      }
    }
    getClass helper = new getClass();
    return helper.movePointer(index, sentinel.next);
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    if (sentinel.next == sentinel)
      return true;
    return false;
  }

  @Override
  public T removeFirst() {
    // TODO Auto-generated method stub
    sentinel.next.next.prev = sentinel;
    sentinel.next = sentinel.next.next;
    return null;
  }

  @Override
  public T removeLast() {
    // TODO Auto-generated method stub
    sentinel.prev.prev.next = sentinel;
    sentinel.prev = sentinel.prev.prev;
    return null;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    int ans = 0;
    Node pointer = sentinel.next;
    while (pointer != sentinel) {
      ans += 1;
      pointer = pointer.next;
    }
    return ans;
  }

  @Override
  public List<T> toList() {
    // TODO Auto-generated method stub
    List<T> ansList = new ArrayList<>();
    Node pointer = sentinel.next;
    while (pointer != sentinel) {
      ansList.add(pointer.item);
      pointer = pointer.next;
    }
    return ansList;
  }

  public LinkedListDeque61B() {
    sentinel = new Node(sentinel, sentinel, null);
    sentinel.next = sentinel;
    sentinel.prev = sentinel;
  }

}
