package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity   // hedhy li tasna3lna l table fi base de donnee
@Table(name = "vehicule")
@Getter   // pour remplacer get w set pour chaque attribut ici on utilise biblio comboque
@Setter
@NoArgsConstructor    // constructeur par defaut
@AllArgsConstructor
public class Vehicule {

    @Id    // cle primaire de tab
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // comment on va generee lid teena
    private Long idVehicule;

    @Column(nullable = false, unique = true, length = 20)
    private String immatriculation;

    @Column(nullable = false, length = 50)
    private String marque;

    @Column(nullable = false, length = 50)
    private String modele;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private CategorieVehicule categorie;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatutVehicule statut;
}