package com.advantum.activity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sevila <josevilah@gmail.com> on 14/12/2016.
 */
@Entity
@Table(name = "vessel_type")
public class VesselType {

    @Id
    @Column(name = "id")
    private Integer vesselTypeId;

    private String name;

    public VesselType() {
    }

    public VesselType(Integer vesselTypeId, String name) {
        this.vesselTypeId = vesselTypeId;
        this.name = name;
    }

    public Integer getVesselTypeId() {
        return vesselTypeId;
    }

    public void setVesselTypeId(Integer vesselTypeId) {
        this.vesselTypeId = vesselTypeId;
    }
}
