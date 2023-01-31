package Convert;

import java.util.HashMap;

public class Measurement {

    HashMap<Integer, String> prefixes = new HashMap<>();

    public Measurement() {

        this.prefixes.put(0, "");
        this.prefixes.put(3, "k");
        this.prefixes.put(6, "M");
        this.prefixes.put(-3, "m");
        this.prefixes.put(-6, "u");
        this.prefixes.put(-9, "n");
        this.prefixes.put(-12, "p");
    }

    public String Convert(double value) {
        double tval = value;
        int order = 0;
        while (tval >= 1000.0) {
            tval /= 1000.0;
            order += 3;
        }
        while (tval < 1.0) {
            tval *= 1000.0;
            order -= 3;
        }
        if (prefixes.containsKey(order)) {
            return ((float) tval) + prefixes.get(order);
        }
        return String.valueOf((float)value);

    }
}
