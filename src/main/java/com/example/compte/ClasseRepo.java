package com.example.compte;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClasseRepo extends JpaRepository<Classe, Long> {

}


