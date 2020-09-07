package com.innowise.group.pathmob.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "subtype")
@Table(name = "subtypes")
@Data
@NoArgsConstructor
public class PathologySubtype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subtype;
    private String model;
    private String cut;
    private String hemodynamic;

}
