package edu.dk.paintings.models;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Data
@Table(name="artists")
@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    //SEQUENCE er auto og TABLE opretter en autoincrement værdi og laver tabel, IDENTITY opdaterer
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String primaryStyle;

    @Column
    private String nationality;

    @Enumerated(value = EnumType.STRING) //så du ikke skriver 1 og Carsten i columns så. Enum ikke står i tal i databasen int men i STRING
    @Column
    private Gender gender;


}
