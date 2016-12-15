package com.advantum.activity.service;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
public class ActivityNotFoundRuntimeException extends RuntimeException {

    private final  Integer activityId;

    public ActivityNotFoundRuntimeException(Integer activityId) {
        this.activityId = activityId;
    }

    @Override
    public String getMessage() {
        return "Activity with id: " + activityId + " not found.";
    }
}
