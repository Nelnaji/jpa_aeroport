package aeroport.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Avion {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String immatriculation;


    @Column(nullable = false, length = 9)
    private int nbVols;

    public Avion(){}

    public Avion(String immatriculation, int nbVols) {
        this();
        this.immatriculation = immatriculation;
        this.nbVols = nbVols;
    }

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Proprietaire proprietaire;


    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getNbVols() {
        return nbVols;
    }

    public void setNbVols(int nbVols) {
        this.nbVols = nbVols;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "immatriculation='" + immatriculation + '\'' +
                ", nbVols=" + nbVols +
                ", proprietaire=" + proprietaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avion avion = (Avion) o;
        return nbVols == avion.nbVols && Objects.equals(immatriculation, avion.immatriculation) && Objects.equals(proprietaire, avion.proprietaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(immatriculation, nbVols, proprietaire);
    }
}
