package com.example.compte;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CompteRepo extends JpaRepository<Compte, Long> {
	// Méthode pour récupérer une liste de comptes pour une classe donnée
    @Query("SELECT c FROM Compte c WHERE c.classe = :classe")
    List<Compte> findComptesByClasse(Classe classe);

}
