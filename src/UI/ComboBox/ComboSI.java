package UI.ComboBox;

import Convert.Measurement;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;

public class ComboSI {

    private static DefaultComboBoxModel GetMeasurementFromUnit(String[] input) {
        Measurement m = new Measurement();
        HashMap<String, String> prefix = m.GetPrefixesValue();
        ArrayList<ComboItem> al = new ArrayList<>();
        for (String s : input) {
            if (prefix.containsKey(s)) {
                al.add(new ComboItem(s, prefix.get(s)));
            }
        }
        return new DefaultComboBoxModel(al.toArray());
    }

    public static DefaultComboBoxModel CapacitorNonPolar() {
        return GetMeasurementFromUnit(new String[]{"u", "n", "p"});
    }

    public static DefaultComboBoxModel CapacitorPolar() {
        return GetMeasurementFromUnit(new String[]{"m", "u"});
    }

    public static DefaultComboBoxModel Frequency() {
        return GetMeasurementFromUnit(new String[]{"k", "M"});
    }

    public static DefaultComboBoxModel Inductor() {
        return GetMeasurementFromUnit(new String[]{"m", "u", "n"});
    }

    public static DefaultComboBoxModel LowResistor() {
        return GetMeasurementFromUnit(new String[]{"", "m"});
    }

    public static DefaultComboBoxModel Resistor() {
        return GetMeasurementFromUnit(new String[]{"", "k", "M"});
    }

    public static DefaultComboBoxModel Voltage() {
        return GetMeasurementFromUnit(new String[]{"", "m"});
    }

}
