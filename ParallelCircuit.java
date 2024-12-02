public class ParallelCircuit implements Resistor {
    private final Resistor a1;
    private final Resistor a2;

    public ParallelCircuit(Resistor a1, Resistor a2) {
        if (a1 == null || a2 == null) {
            throw new IllegalArgumentException("Schwingkreis: Beide Widerstände müssen angegeben werden.");
        }
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double resistance() {
        double r1 = a1.resistance();
        double r2 = a2.resistance();
        if (r1 == 0 || r2 == 0) throw new IllegalArgumentException("Schwingkreis: Ungültiger Widerstandswert.");
        return (r1 * r2) ;
    }
}

