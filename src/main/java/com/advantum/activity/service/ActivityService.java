package com.advantum.activity.service;

import com.advantum.activity.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;
    
}
