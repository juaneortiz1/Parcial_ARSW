package edu.escuelaing.arsw.ASE.app.WebServer;

import org.springframework.stereotype.Component; // Import Spring's component annotation
import java.util.HashMap;

/**
 * This class allows the server to return a JSON object already saved
 * in a HashMap, based on the symbol, but if it is not it saves it
 */
@Component // Add Spring's component annotation
public class CacheQuery {

    private final HashMap<String, String> cache;

    public CacheQuery() {
        this.cache = new HashMap<>();
    }

    /**
     * Allows to get hash maps key
     * @param key key to the JSON
     * @return Json If exists
     */
    public String get(String key) {
        return cache.get(key);
    }

    /**
     * Allows to put Json with a key
     * @param key key to the JSON
     * @param value JSON object
     */
    public void put(String key, String value) {
        cache.put(key, value);
    }

    /**
     * Method to verify if the key already exists
     * @param key Symbol to check if it exists
     * @return true if it does exist
     */
    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }
}

