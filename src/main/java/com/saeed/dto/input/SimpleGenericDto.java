package com.saeed.dto.input;

import java.io.Serializable;
import java.util.Objects;

public class SimpleGenericDto<K, V, D> implements Serializable {

    private K key;
    private V value;
    private D description;

    public SimpleGenericDto() {
    }

    public SimpleGenericDto(K key) {
        this.key = key;
    }

    public SimpleGenericDto(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public SimpleGenericDto(K key, V value, D description) {
        this.key = key;
        this.value = value;
        this.description = description;
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

    public D getDescription() {
        return description;
    }

    public void setDescription(D description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleGenericDto<?, ?, ?> that = (SimpleGenericDto<?, ?, ?>) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(value, that.value) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, description);
    }
}
