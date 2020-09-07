package com.innowise.group.pathmob.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "pathology")
@Table(name = "pathologies")
@Data
@NoArgsConstructor
public class Pathology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private PathologyType type;

    @OneToMany(fetch = FetchType.LAZY)
    private List<PathologySubtype> subtypes;

}