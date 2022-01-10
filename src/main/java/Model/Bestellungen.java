package Model;

import java.util.List;
import java.util.Objects;

public class Bestellungen {
    private Integer bestellnr;
    private String adresse;
    private List<Product> list;

    public Integer getBestellnr() {
        return bestellnr;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bestellungen that = (Bestellungen) o;
        return Objects.equals(bestellnr, that.bestellnr) && Objects.equals(adresse, that.adresse) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bestellnr, adresse, list);
    }

    @Override
    public String toString() {
        return "Bestellungen{" +
                "bestellnr=" + bestellnr +
                ", adresse='" + adresse + '\'' +
                ", list=" + list +
                '}';
    }
}
