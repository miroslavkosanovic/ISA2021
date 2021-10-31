package ftn.ISA.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "reservable_type")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reservable implements Serializable {

    @Column
    private Date reservation;

    @Column
    private Double averageRating;

    @Column
    private Double price;

    @Column
    private Integer discountPercent;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
}
