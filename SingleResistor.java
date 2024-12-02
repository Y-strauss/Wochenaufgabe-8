public class SingleResistor implements Resistor {
    private final double a1;

    public SingleResistor(double a1) {
        if (a1 <= 0) {
            throw new IllegalArgumentException("Schwingkreis: Widerstandswert muss positiv sein.");
        }
        this.a1 = a1;
    }

    @Override
    public double resistance() {
        return a1;
    }

    @Override
    public int resistorCount() {
        return 1;
    }
}

