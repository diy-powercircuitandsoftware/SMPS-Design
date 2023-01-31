package UI.ComboBox;

public class ComboItem {

    public String key;
    public String value;

    public ComboItem(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.key;
    }
}
