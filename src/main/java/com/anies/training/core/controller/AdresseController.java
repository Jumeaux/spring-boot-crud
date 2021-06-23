package com.anies.training.core.controller;


import com.anies.training.core.entity.adresse.Adresse;
import com.anies.training.core.service.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdresseController {

    @Autowired
    AdresseService adresseService;


    // create new Adresse
    @PostMapping("adresse")
    public ResponseEntity<Adresse>  createAdresse(@RequestBody Adresse adresse) throws Exception{

        if (adresse.getId()!=null){
            throw new Exception("A new adresse cannot already have an ID");
        }
        Adresse res= adresseService.createAdresse(adresse);
        return  ResponseEntity.ok().body(res);
    }

    // update Adresse
    @PutMapping("adresse")
    public ResponseEntity<Adresse>  updateAdresse(@RequestBody Adresse adresse) throws Exception{
        if (adresse.getId()== null){
            throw new Exception("Bad request ID invalid");
        }
        Adresse res= adresseService.createAdresse(adresse);
        return  ResponseEntity.ok().body(res);
    }


    // get all Adresse
    @GetMapping("/adresse")
    public ResponseEntity<List<Adresse>> getAllAdresse(){
        List<Adresse> res= adresseService.getAllAdresse();

        return  ResponseEntity.ok().body(res);
    }

    // get One Adresse by id
    @GetMapping("/adresse/{id}")
    public ResponseEntity<Adresse> getOneAdresse(@PathVariable Long id){
        Adresse res= adresseService.getAdresse(id).orElseThrow();

        return  ResponseEntity.ok().body(res);
    }

    @DeleteMapping("/adresse/{id}")
    public void deleteMenage(@PathVariable Long id){
        adresseService.deleteAdresse(id);
    }





}
