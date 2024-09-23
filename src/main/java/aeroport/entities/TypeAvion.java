package aeroport.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class TypeAvion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 80)
    private String nom;

    @Column(nullable = false, length = 80)
    private String Fabriquant;

    @Column(nullable = false, length = 10)
    private int puissance;

    @Column(nullable = false, length = 4)
    private int nbPlace;

public TypeAvion(){}
    public TypeAvion(String nom, String fabriquant, int puissance, int nbPlace) {
    this();
        this.nom = nom;
        Fabriquant = fabriquant;
        this.puissance = puissance;
        this.nbPlace = nbPlace;
    }

    public long getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFabriquant() {
        return Fabriquant;
    }

    public void setFabriquant(String fabriquant) {
        Fabriquant = fabriquant;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public String toString() {
        return "TypeAvion{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", Fabriquant='" + Fabriquant + '\'' +
                ", puissance=" + puissance +
                ", nbPlace=" + nbPlace +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeAvion typeAvion = (TypeAvion) o;
        return id == typeAvion.id && puissance == typeAvion.puissance && nbPlace == typeAvion.nbPlace && Objects.equals(nom, typeAvion.nom) && Objects.equals(Fabriquant, typeAvion.Fabriquant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, Fabriquant, puissance, nbPlace);
    }
}
