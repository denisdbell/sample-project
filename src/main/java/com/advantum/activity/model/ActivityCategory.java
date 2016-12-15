package com.advantum.activity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sevila <josevilah@gmail.com> on 14/12/2016.
 */
@Entity
@Table(name = "activity_category")
public class ActivityCategory {

    @Id
    @Column(name = "id")
    private Integer activityCategoryId;

    private String name;

    public ActivityCategory() {

    }

    public ActivityCategory(Integer activityCategoryId, String name) {
        this.activityCategoryId = activityCategoryId;
        this.name = name;
    }

    public Integer getActivityCategoryId() {
        return activityCategoryId;
    }

    public void setActivityCategoryId(Integer activityCategoryId) {
        this.activityCategoryId = activityCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
