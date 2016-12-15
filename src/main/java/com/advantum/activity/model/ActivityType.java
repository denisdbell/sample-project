package com.advantum.activity.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 14/12/2016.
 */
@Entity
@Table(name = "activity_type")
public class ActivityType {

    @Id
    @Column(name = "id")
    private Integer activityTypeId;

    @ManyToMany
    private List<ActivityCategory> activityCategories = new ArrayList<ActivityCategory>();

    private String name;

    private boolean mandatory;

    private Integer occurrences;

    private Boolean rangedActivityIndicator;

    @Column(name = "_order")
    private Integer order;

    @ManyToMany
    private List<VesselType> vesselTypes = new ArrayList<VesselType>();

    private String description;

    public ActivityType() {
    }

    public ActivityType(Integer activityTypeId, List<ActivityCategory> activityCategories, String name, boolean mandatory, Integer occurrences, Boolean rangedActivityIndicator, Integer order, List<VesselType> vesselTypes, String description) {
        this.activityTypeId = activityTypeId;
        this.activityCategories = activityCategories;
        this.name = name;
        this.mandatory = mandatory;
        this.occurrences = occurrences;
        this.rangedActivityIndicator = rangedActivityIndicator;
        this.order = order;
        this.vesselTypes = vesselTypes;
        this.description = description;
    }

    public Integer getActivityTypeId() {
        return activityTypeId;
    }

    public void setActivityTypeId(Integer activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    public List<ActivityCategory> getActivityCategories() {
        return activityCategories;
    }

    public void setActivityCategories(List<ActivityCategory> activityCategories) {
        this.activityCategories = activityCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public Integer getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(Integer occurrences) {
        this.occurrences = occurrences;
    }

    public Boolean getRangedActivityIndicator() {
        return rangedActivityIndicator;
    }

    public void setRangedActivityIndicator(Boolean rangedActivityIndicator) {
        this.rangedActivityIndicator = rangedActivityIndicator;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<VesselType> getVesselTypes() {
        return vesselTypes;
    }

    public void setVesselTypes(List<VesselType> vesselTypes) {
        this.vesselTypes = vesselTypes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
