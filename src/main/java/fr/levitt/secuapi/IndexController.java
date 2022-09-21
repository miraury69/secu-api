package fr.levitt.secuapi;

import fr.levitt.secuapi.core.Utilisateur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public Utilisateur index() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        return utilisateur;
    }
}
