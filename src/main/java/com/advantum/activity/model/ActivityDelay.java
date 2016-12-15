package com.advantum.activity.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sevila <josevilah@gmail.com> on 14/12/2016.
 */
@Entity
@Table(name = "activity_delay")
public class ActivityDelay {
    // TODO: change Date by ZonedDateTime
    @Id
    @Column(name = "id")
    private Integer activityDelayId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date_time")
    private Date startDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date_time")
    private Date endDateTime;

    private String reason;

    public ActivityDelay() {
    }

    public ActivityDelay(Integer activityDelayId, Date startDateTime, Date endDateTime, String reason) {
        this.activityDelayId = activityDelayId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.reason = reason;
    }

    public Integer getActivityDelayId() {
        return activityDelayId;
    }

    public void setActivityDelayId(Integer activityDelayId) {
        this.activityDelayId = activityDelayId;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
