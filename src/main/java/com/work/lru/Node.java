package com.work.lru;

public class Node<K, V> {
    K key;
    V value;
    Node<K, V> prevNode;
    Node<K, V> nextNode;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.prevNode=null;
        this.nextNode=null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getPrevNode() {
        return prevNode;
    }

    public Node<K, V> getNextNode() {
        return nextNode;
    }

    public void setPrevNode(Node<K, V> prevNode) {
        this.prevNode = prevNode;
    }

    public void setNextNode(Node<K, V> nextNode) {
        this.nextNode = nextNode;
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", key=" + key +
                '}';
    }
}
