package pl.designuj.zeppelin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    @Column(precision = 3)
    private BigDecimal weight;

    @Enumerated(value = EnumType.STRING)
    private CargoType cargoType;

    private boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @Embedded
    private Audit audit;
}
