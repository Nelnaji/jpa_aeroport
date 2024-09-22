package aeroport.entities;

import jakarta.persistence.Entity;

@Entity
public class Mecanicien extends Personne {

    public Mecanicien() {
    }
    public Mecanicien(String nom, int tel, Adresse adresse) {

        super(nom, tel, adresse);
    }



}
