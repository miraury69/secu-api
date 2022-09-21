package fr.levitt.secuapi.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Scanner;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int IdReservation;
    private Utilisateur client;
    private Chambre chambre;
    private int Durée;

    public int getIdReservation() {
        return IdReservation;
    }
    public void setIdReservation(int idReservation) {
        IdReservation = idReservation;
    }

    public Utilisateur getClient() {
        return client;
    }
    public void setClient(Utilisateur client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public int getDurée() {
        return Durée;
    }
    public void setDurée(int durée) {
        Durée = durée;
    }
}
