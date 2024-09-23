package aeroport.entities;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Pilote extends Personne {

    @Column(nullable = false, length = 15)
    private String brevet;

    public Pilote() {
        this.typeAvion = new HashSet<TypeAvion>();
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

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<TypeAvion> typeAvion;



    public Set<TypeAvion> getTypeAvion(){
        return Set.copyOf(typeAvion);
    }

    public void addTypeAvion(TypeAvion typeAvion) {
        this.typeAvion.add(typeAvion);
    }

    public void removeTypeAvion(TypeAvion typeAvion) {
        this.typeAvion.remove(typeAvion);
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
