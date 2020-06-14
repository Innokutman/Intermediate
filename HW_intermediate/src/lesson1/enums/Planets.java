package lesson1.enums;

public enum Planets {
    Mercury(45), Venus(79), Earth(81), Mars(68),
    Jupiter, Saturn, Uranus, Neptune;

    private double weight;

    Planets() {
    }

    Planets(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
