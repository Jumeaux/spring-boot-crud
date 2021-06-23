package com.anies.training.core.service.Impl;

import com.anies.training.core.entity.menage.Menage;
import com.anies.training.core.repository.MenageRepository;
import com.anies.training.core.service.MenageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MenageImpl implements MenageService {

    @Autowired
    MenageRepository menageRepository;

    @Override
    public Menage createMenage(Menage menage) {

        return menageRepository.save(menage);
    }

    @Override
    public Menage updateMenage(Menage menage) {

        return menageRepository.save(menage);
    }

    @Override
    public Optional<Menage> getMenage(Long id) {
        return menageRepository.findById(id);
    }

    @Override
    public List<Menage> getAllMenage() {


        return menageRepository.findAll();
    }

    @Override
    public void deleteMenage(Long id) {
        menageRepository.deleteById(id);
    }
}
