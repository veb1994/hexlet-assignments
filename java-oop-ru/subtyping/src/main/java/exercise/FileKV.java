package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private final Map<String, String> storage;
    private final String path;

    public FileKV(String path, Map<String, String> storage) {
        this.storage = new HashMap<>(storage);
        this.path = path;
        Utils.writeFile(this.path, Utils.serialize(this.storage));
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
// END
