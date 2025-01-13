package com.nguyenthanhlong;

public class Dictionary<K extends Number, V> {
    K key;
    V value;

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "key = " + key + "\nvalue = " + value;
    }
}
