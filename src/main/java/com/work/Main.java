package com.work;

import com.work.lru.LRUCache;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LRUCache<String, String> lruCache = new LRUCache<>(3);

        lruCache.put("a-1", "test-1");
        lruCache.put("a-2", "test-2");
        lruCache.put("a-3", "test-3");
        lruCache.get("a-2");
        lruCache.put("a-4", "test-4");
        lruCache.put("a-5", "test-5");

        System.out.println(lruCache.get("a-3"));
    }
}