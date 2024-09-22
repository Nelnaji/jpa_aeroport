package aeroport.entities;


import jakarta.persistence.*;

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


}
