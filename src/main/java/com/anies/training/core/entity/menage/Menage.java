package com.anies.training.core.entity.menage;

import com.anies.training.core.entity.adresse.Adresse;

import javax.persistence.*;


@Entity
//  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Menage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "code_menage")
    String codeMenage;

    @Column(name = "id_chef")
    String idChef;

    @Column(name = "nom_chef")
    String nomChef;
    @Column(name = "prenom_chef")
    String prenomChef;

    @OneToMany(mappedBy = "menage")
    Set<Membre> membres= new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "adresse_id")
    @JsonIgnoreProperties(value = "menages", allowSetters = true)
    Adresse adresse;


    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeMenage() {
        return codeMenage;
    }

    public void setCodeMenage(String codeMenage) {
        this.codeMenage = codeMenage;
    }

    public String getIdChef() {
        return idChef;
    }

    public void setIdChef(String idChef) {
        this.idChef = idChef;
    }

    public String getNomChef() {
        return nomChef;
    }

    public void setNomChef(String nomChef) {
        this.nomChef = nomChef;
    }

    public String getPrenomChef() {
        return prenomChef;
    }

    public void setPrenomChef(String prenomChef) {
        this.prenomChef = prenomChef;
    }
}
