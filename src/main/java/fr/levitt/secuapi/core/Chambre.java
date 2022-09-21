package fr.levitt.secuapi.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import fr.levitt.secuapi.core.Categorie;
import java.util.Scanner;

@Entity
public class Chambre {
    @Id
    @GeneratedValue
    private int IdChambre;
    private Categorie CatChambre;
    private Reservation reservationChambre;

    public int GetIdChamber(){
        return IdChambre;
    }

    public Categorie getCatChambre() {
        return CatChambre;
    }

    public Reservation getReservationChambre() {
        return reservationChambre;
    }

    public void setCatChambre(Categorie catChambre) {
        CatChambre = catChambre;
    }
    public void setReservationChambre(Reservation reservationChambre) {
        this.reservationChambre = reservationChambre;
    }
    public void setIdChambre(int idChambre) {
        IdChambre = idChambre;
    }



}
