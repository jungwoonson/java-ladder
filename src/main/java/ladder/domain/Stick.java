package ladder.domain;

import java.util.Objects;

public class Stick {

    private final boolean value;

    public Stick(final boolean value) {
        this.value = value;
    }

    public Stick(final StickDecisionStrategy stickDecisionStrategy) {
        this(stickDecisionStrategy.isExists());
    }

    public boolean isTrueAndSo(Stick stick) {
        return this.value && stick.value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stick stick = (Stick) o;
        return value == stick.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Stick{" +
                "value=" + value +
                '}';
    }
}
