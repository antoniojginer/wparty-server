package com.partyapp.commons.dataAccess.query.event.convention;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "convention_type")
@Data
public class ConventionTypeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;
}
