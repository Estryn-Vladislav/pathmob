package com.innowise.group.pathmob.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "type")
@Table(name = "types")
@Data
@NoArgsConstructor
public class PathologyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

}
