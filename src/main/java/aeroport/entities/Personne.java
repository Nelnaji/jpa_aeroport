package aeroport.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,length = 80)
    private String nom;
    @Column(nullable = false,length = 123)
    private String prenom;

    @Column(nullable = false, length = 15)
    private int tel;

@Embedded
    private Adresse adresse;

    public Personne(){};
    public Personne(String nom, int tel, Adresse adresse) {
        this();
        this.nom = nom;
        this.tel = tel;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return tel == personne.tel && Objects.equals(nom, personne.nom) && Objects.equals(adresse, personne.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, tel, adresse);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", tel=" + tel +
                ", adresse=" + adresse +
                '}';
    }
}
