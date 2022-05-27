package com.AlbertAbuav.Exhibition.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "booths")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number;
    @Enumerated(EnumType.STRING)
    private BoothType type;
    private String wallsDescription;
}
