package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String str;

    public ReversedSequence(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        this.str = revStr;
    }

    public String toString() {
        return this.str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return str.substring(start, end);
    }
}
// END
