package com.work.lru;

import java.util.HashMap;

public class LRUCache<K, V> {

    HashMap<K, Node<K, V>> hashMap;
    int capacity;
    DoublyLinkedList<K, V> doublyLinkedList;

    public LRUCache(int capacity) {
        this.hashMap = new HashMap<>();
        this.capacity = capacity;
        this.doublyLinkedList = new DoublyLinkedList<K, V>();
    }

    public V get(K key) {
        if (null != hashMap.get(key)) {
            Node<K, V> node = hashMap.get(key);
            doublyLinkedList.moveToFirst(node);
            return node.getValue();
        }
        return null;
    }

    public K put(K key, V value) {

        if (null != hashMap.get(key)) {
            Node<K, V> node = hashMap.get(key);
            node.value = value;
            doublyLinkedList.moveToFirst(node);
        } else {
            if (doublyLinkedList.getSize() >= capacity) {
                Node<K, V> node = doublyLinkedList.removeLast();
                hashMap.remove(node.key);
            }
            Node<K, V> newNode = new Node<>(key, value);
            Node<K, V> node = doublyLinkedList.addFirst(newNode);
            hashMap.put(key, node);

        }
        return key;
    }
}
