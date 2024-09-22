package aeroport.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import java.util.Objects;

@Entity
public class Pilote extends Personne{

@Column(nullable = false, length = 15)
    private String brevet;

    public Pilote() {
    }

    public Pilote(String nom, int tel, Adresse adresse, String brevet) {
        super(nom, tel, adresse);
        this.brevet = brevet;
    }

    public String getBrevet() {
        return brevet;
    }

    public void setBrevet(String brevet) {
        this.brevet = brevet;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pilote pilote = (Pilote) o;
        return Objects.equals(brevet, pilote.brevet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brevet);
    }

    @Override
    public String toString() {
        return "Pilote{" +
                "brevet='" + brevet + '\'' +
                '}';
    }
}
