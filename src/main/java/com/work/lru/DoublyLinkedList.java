package com.work.lru;

public class DoublyLinkedList<K, V> {
    Node<K, V> head;
    Node<K, V> tail;
    private int size;

    public DoublyLinkedList() {
        this.head = new Node<>(null, null);
        this.tail = new Node<>(null, null);

        head.setPrevNode(null);
        head.setNextNode(tail);

        tail.setPrevNode(head);
        tail.setNextNode(null);

        this.size = 0;
    }

    public Node<K, V> addFirst(Node<K, V> node) {
        Node<K, V> temp = head.nextNode;

        node.prevNode = head;
        node.nextNode = temp;

        head.nextNode = node;
        temp.prevNode = node;

        size++;

        return node;
    }

    public Node<K, V> moveToFirst(Node<K, V> node) {
        node.prevNode.nextNode = node.nextNode;
        node.nextNode.prevNode = node.prevNode;

        node.prevNode = head;
        node.nextNode = head.nextNode;

        head.nextNode = node;
        node.nextNode.prevNode = node;

        return node;
    }

    public Node<K, V> removeLast() {
        Node<K, V> node = tail.prevNode;

        node.prevNode.nextNode = tail;
        tail.prevNode = node.prevNode;

        node.prevNode = null;
        node.nextNode = null;

        size--;

        return node;
    }

    public Node<K, V> remove(Node<K, V> node) {
        node.prevNode.nextNode = node.nextNode;
        node.nextNode.prevNode = node.prevNode;

        node.prevNode = null;
        node.nextNode = null;

        size--;

        return node;
    }

    public int getSize() {
        return size;
    }
}
