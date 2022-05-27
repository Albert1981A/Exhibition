package com.AlbertAbuav.Exhibition.beans;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false)
    private String name;
    private float cashFlow;
    @Enumerated(EnumType.STRING)
    private Credit credit;

    //@OneToMany
    @OneToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Booth> booths = new ArrayList<>();

}
