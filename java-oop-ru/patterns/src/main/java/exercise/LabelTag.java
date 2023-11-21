package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String labelText;
    private TagInterface tagInterface;

    public LabelTag(String labelText, TagInterface tagInterface) {
        this.labelText = labelText;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        String tagInterfaceText = tagInterface.render();
        return String.format("<label>%s%s</label>",labelText, tagInterfaceText);
    }
}
// END
