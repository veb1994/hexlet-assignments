package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{
    private String tagBody;
    private List<Tag> childTags;

    public PairedTag(String tagName, Map<String, String> attributes, String tagBody, List<Tag> childTags) {
        super(tagName, attributes);
        this.tagBody = tagBody;
        this.childTags = childTags;
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
        result.append(tagBody);
        for (var child : childTags) {
            result.append(child.toString());
        }
        result.append(String.format("</%s>", getTagName()));
        return result.toString();
    }
}
// END
