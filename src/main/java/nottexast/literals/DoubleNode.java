package nottexast.literals;

public class DoubleNode extends NumberNode {

    private final Double value;

    public DoubleNode(Double value) {
        if (value == null)
            throw new AssertionError();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoubleNode that = (DoubleNode) o;

        return value.equals(that.value);

    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public String getStringRepr() {
        return String.valueOf(value);
    }

    @Override
    public Number getNumberValue() {
        return value;
    }

    public Double getValue() {
        return value;
    }
}