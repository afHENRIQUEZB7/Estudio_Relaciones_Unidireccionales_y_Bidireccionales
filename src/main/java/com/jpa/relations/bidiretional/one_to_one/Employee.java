package com.jpa.relations.bidiretional.one_to_one;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bi_Employee_one_to_one")
@Table(name = "bi_Employee_one_to_one")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = ParkingSpot.class)
    @JoinColumn(name = "id_parking_spot")
    private ParkingSpot parkingSpot;
}
