package fr.levitt.secuapi.sql;

import fr.levitt.secuapi.core.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {
}
