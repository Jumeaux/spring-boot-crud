package com.anies.training.core.service.Impl;

import com.anies.training.core.entity.membre.Membre;
import com.anies.training.core.repository.MembreRepository;
import com.anies.training.core.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MembreImpl implements MembreService {

    @Autowired
    MembreRepository membreRepository;

    @Override
    public Membre createMembre(Membre membre) {

        return  membreRepository.save(membre);
    }

    @Override
    public Membre updateMembre(Membre membre) {
        return membreRepository.save(membre);
    }

    @Override
    public Optional<Membre> getMembre(Long id) {

        return membreRepository.findById(id);
    }

    @Override
    public List<Membre> getAllMembre() {

       return membreRepository.findAll();
    }

    @Override
    public void deleteMembre(Long id) {
        membreRepository.deleteById(id);
    }
}
