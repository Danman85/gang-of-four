package nl.danman85.gang.of.four.patterns.abstractfactory.model;

import java.util.List;
import java.util.Objects;

/**
 * Frietje
 */
public class Frietje {

    private final Friet friet;
    private final List<Sauce> sauces;

    public Frietje(Friet friet, List<Sauce> sauces) {
        this.friet = friet;
        this.sauces = sauces;
    }

    public Friet getFriet() {
        return this.friet;
    }

    public List<Sauce> getSauces() {
        return this.sauces;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Frietje)) {
            return false;
        }
        Frietje frietje = (Frietje) o;
        return Objects.equals(friet, frietje.friet) && Objects.equals(sauces, frietje.sauces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friet, sauces);
    }

    @Override
    public String toString() {
        return "{" +
            " friet='" + getFriet() + "'" +
            ", sauces='" + getSauces() + "'" +
            "}";
    }
}