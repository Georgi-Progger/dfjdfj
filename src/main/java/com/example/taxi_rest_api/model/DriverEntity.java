package com.example.taxi_rest_api.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "drivers")
@AllArgsConstructor
@NoArgsConstructor
public class DriverEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "telephone")
    private Long telephoneNumber;
    @Column(name = "point_A")
    private String pointA;
    @Column(name = "point_B")
    private String pointB;


}
