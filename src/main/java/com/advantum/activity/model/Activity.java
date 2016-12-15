package com.advantum.activity.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 14/12/2016.
 */
@Entity
@Table(name = "activity")
public class Activity {
    // TODO: change Date by Date
    @Id
    @Column(name = "id")
    private Integer activityId;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date_time")
    private Date startDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date_time")
    private Date endDateTime;

    private String value;

    @ManyToOne
    private ActivityType activityType;

    @OneToMany()
    private List<ActivityDelay> activityDelays;

    @ManyToOne
    private User user;

    public Activity() {
    }

    public Activity(Integer activityId, String description, Date startDateTime, Date endDateTime, String value, ActivityType activityType, List<ActivityDelay> activityDelays, User user) {
        this.activityId = activityId;
        this.description = description;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.value = value;
        this.activityType = activityType;
        this.activityDelays = activityDelays;
        this.user = user;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public List<ActivityDelay> getActivityDelays() {
        return activityDelays;
    }

    public void setActivityDelays(List<ActivityDelay> activityDelays) {
        this.activityDelays = activityDelays;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
