package fr.levitt.secuapi;

import fr.levitt.secuapi.core.Chambre;
import fr.levitt.secuapi.core.Reservation;
import fr.levitt.secuapi.core.Utilisateur;
import fr.levitt.secuapi.sql.ChambreRepository;
import fr.levitt.secuapi.sql.ReservationRepository;
import fr.levitt.secuapi.sql.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class IndexController {


    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private ChambreRepository chambreRepository;
    @Autowired
    private ReservationRepository reservationRepository;


    @GetMapping("/newUser")
    public void addRandomUser() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto"+Math.random());
        utilisateur.setPrenom("Tata"+Math.random());
        utilisateurRepository.save(utilisateur);
    }

    @GetMapping("/user")
    public Iterable<Utilisateur> getUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @GetMapping("/Chambre")
    public Iterable<Chambre> getChambre(){
        return chambreRepository.findAll();
    }

    @GetMapping("/reservation")
    public Iterable<Reservation> getReservation(){
        return reservationRepository.findAll();
    }

    @GetMapping("/")
    public Utilisateur index() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        return utilisateur;
    }


    public UtilisateurRepository getUtilisateurRepository() {
        return utilisateurRepository;
    }

    public void setUtilisateurRepository(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
}
