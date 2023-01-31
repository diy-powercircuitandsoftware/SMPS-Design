package UI.ComboBox;

public class ComboItem {

    public int key;
    public String value;

    public ComboItem(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
