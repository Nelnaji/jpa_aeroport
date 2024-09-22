package aeroport.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Adresse {

    @Column(nullable = false, length = 100)
    private String rue;

    @Column(nullable = false, length = 4)
    private int cp;

    @Column(nullable = false, length = 100)
    private String ville;


    public Adresse(){};
    public Adresse(String rue, int cp, String ville) {
        this();
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return cp == adresse.cp && Objects.equals(rue, adresse.rue) && Objects.equals(ville, adresse.ville);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rue, cp, ville);
    }


    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", cp=" + cp +
                ", ville='" + ville + '\'' +
                '}';
    }
}
