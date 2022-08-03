package com.partyapp.query.event.extension.party.dataAccess;

import com.partyapp.query.event.dataAccess.BaseEventDAO;
import com.partyapp.query.event.extension.convention.dataAccess.ConventionTypeDAO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "party")
@Data
public class PartyEventDAO {
    @Id
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
    @Column(name = "dj_names")
    private String diskJockeys;
    @Column(name = "assistants_names")
    private String assistants;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private BaseEventDAO event;

    @ManyToOne
    @JoinColumn(name = "party_type")
    private PartyTypeDAO partyType;

}