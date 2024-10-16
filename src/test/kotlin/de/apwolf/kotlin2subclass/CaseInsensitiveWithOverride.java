package de.apwolf.kotlin2subclass;

import java.util.HashMap;

public class CaseInsensitiveWithOverride<V> extends HashMap<String, V> {

    @Override
    public V put(String key, V value) {
        return super.put(key.toLowerCase(), value);
    }

    @Override
    public V get(Object key) {
        // This method is called with all Kotlin versions
        System.out.println("CaseInsensitiveWithOverride in subclass");
        return super.get(((String) key).toLowerCase());
    }
}