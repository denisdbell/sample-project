package com.advantum.activity.service;

import com.advantum.activity.model.Activity;
import com.advantum.activity.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Activity add(Activity activity) {
        return activityRepository.saveAndFlush(activity);
    }

    public List<Activity> list() {
        return activityRepository.findAll();
    }
}
