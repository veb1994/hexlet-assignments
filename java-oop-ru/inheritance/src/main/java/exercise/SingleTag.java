package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
public class SingleTag extends Tag{
    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("<%s ", getTagName()));
        Map<String, String> attributes = new LinkedHashMap<>(getAttributes());
        attributes.forEach((key, value) -> {
            result.append(String.format("%s=\"%s\" ", key, value));
        });
        result.deleteCharAt(result.length() - 1);
        result.append(">");
        return result.toString();
    }
}
// END
