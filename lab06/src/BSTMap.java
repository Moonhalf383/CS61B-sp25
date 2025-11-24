// 如果你的其他文件（如 Map61B）有 package 定义（看一眼第一行），
// 这里也要加上 package xxx; 
// 根据你的文件结构，目前看似没有包名，或者默认包。

import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {

  // 下面全是应付编译器的空方法
  @Override
  public void clear() {
  }

  @Override
  public boolean containsKey(K key) {
    return false;
  }

  @Override
  public V get(K key) {
    return null;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public void put(K key, V value) {
  }

  @Override
  public Set<K> keySet() {
    return null;
  }

  @Override
  public V remove(K key) {
    return null;
  }

  @Override
  public V remove(K key, V value) {
    return null;
  }

  @Override
  public Iterator<K> iterator() {
    return null;
  }
}
