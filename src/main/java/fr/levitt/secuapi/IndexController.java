package fr.levitt.secuapi;

import fr.levitt.secuapi.core.Utilisateur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/test")
    public Utilisateur index() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        return utilisateur;
    }
    @GetMapping("/test2")
    public Utilisateur index2() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toton");
        utilisateur.setPrenom("Tatan");
        return utilisateur;
    }
}
