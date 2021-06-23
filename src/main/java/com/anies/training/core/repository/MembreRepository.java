package com.anies.training.core.repository;

import com.anies.training.core.entity.membre.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<Membre,Long> {
}
