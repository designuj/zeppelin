package pl.designuj.zeppelin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "airports")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private IATACode iataCode;

    private String country;
}
