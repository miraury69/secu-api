package fr.levitt.secuapi.core;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    private int idUtilisateur;
    private String nom;
    private String prenom;

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
