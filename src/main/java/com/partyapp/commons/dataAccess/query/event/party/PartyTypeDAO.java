package com.partyapp.commons.dataAccess.query.event.party;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "party_type")
@Data
public class PartyTypeDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;
}
