package UI.ComboBox;

import javax.swing.DefaultComboBoxModel;

public class ComboSI {
 public static DefaultComboBoxModel CapacitorNonPolar = new DefaultComboBoxModel(new ComboItem[]{ new ComboItem("u", "0.000001"), new ComboItem("n", "0.000000001"), new ComboItem("p", "0.000000000001")});
    public static DefaultComboBoxModel CapacitorPolar = new DefaultComboBoxModel(new ComboItem[]{new ComboItem("-", "1"), new ComboItem("m", "0.001"), new ComboItem("u", "0.000001")});
    public static DefaultComboBoxModel Frequency = new DefaultComboBoxModel(new ComboItem[]{new ComboItem("k", "1000"), new ComboItem("M", "1000000")});
    public static DefaultComboBoxModel Inductor = new DefaultComboBoxModel(new ComboItem[]{new ComboItem("-", "1"), new ComboItem("m", "0.001"), new ComboItem("u", "0.000001"), new ComboItem("n", "0.000000001")});
    public static DefaultComboBoxModel Resistor = new DefaultComboBoxModel(new ComboItem[]{new ComboItem("-", "1"), new ComboItem("k", "1000"), new ComboItem("M", "1000000")});
}
