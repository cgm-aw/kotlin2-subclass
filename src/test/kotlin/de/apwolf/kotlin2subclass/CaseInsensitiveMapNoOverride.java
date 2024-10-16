package de.apwolf.kotlin2subclass;

import java.util.HashMap;

public class CaseInsensitiveMapNoOverride<V> extends HashMap<String, V> {

    @Override
    public V put(String key, V value) {
        return super.put(key.toLowerCase(), value);
    }

    public V get(String key) {
        // This method won't get called with Kotlin 2
        System.out.println("CaseInsensitiveMapNoOverride in subclass");
        return super.get(key.toLowerCase());
    }
}