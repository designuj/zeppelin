package pl.designuj.zeppelin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String number;

    private LocalDateTime departureAt;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", nullable = false)
    private Airport arrivalAirport;

    @OneToMany(mappedBy = "flight")
    private Set<Cargo> cargo;

    @Embedded
    private Audit audit;
}
