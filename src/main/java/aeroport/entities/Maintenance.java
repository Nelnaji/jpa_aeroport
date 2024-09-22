package aeroport.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
public class Maintenance {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 300)
    private String Objet;

    @Column(nullable = false, name = "date_internvention")
    private LocalDate dateIntervention;

    @Column(nullable = false)
    private LocalTime duree;

    @ManyToOne
    private Mecanicien mecanicien;

    @ManyToOne
    private Avion avion;


    public long getId() {
        return id;
    }


    public String getObjet() {
        return Objet;
    }

    public void setObjet(String objet) {
        Objet = objet;
    }

    public LocalDate getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(LocalDate dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }


    public Maintenance() {
    }

    public Maintenance(String objet, LocalDate dateIntervention, LocalTime duree) {
        this();
        Objet = objet;
        this.dateIntervention = dateIntervention;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "id=" + id +
                ", Objet='" + Objet + '\'' +
                ", dateIntervention=" + dateIntervention +
                ", duree=" + duree +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maintenance that = (Maintenance) o;
        return id == that.id && Objects.equals(Objet, that.Objet) && Objects.equals(dateIntervention, that.dateIntervention) && Objects.equals(duree, that.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Objet, dateIntervention, duree);
    }
}
