public class SeriesCircuit implements Resistor {
    private final Resistor a1;
    private final Resistor a2;

    public SeriesCircuit(Resistor a1, Resistor a2) {
        if (a1 == null || a2 == null) {
            throw new IllegalArgumentException("Schwingkreis: Beide Widerstände müssen angegeben werden.");
        }
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double resistance() {
        return a1.resistance() + a2.resistance();
    }

    @Override
    public int resistorCount() {
        return a1.resistorCount() + a2.resistorCount();
    }
}

