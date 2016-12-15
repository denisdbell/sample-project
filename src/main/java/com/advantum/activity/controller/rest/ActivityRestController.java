package com.advantum.activity.controller.rest;

import com.advantum.activity.model.Activity;
import com.advantum.activity.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
@RestController
@RequestMapping("api/activities")
public class ActivityRestController {

    @Autowired
    private ActivityService activityService;

    public ResponseEntity<List<Activity>> list() {
        List<Activity> activities = activityService.list();
        return new ResponseEntity<List<Activity>>(activities, HttpStatus.OK);
    }

    public ResponseEntity<Activity> findOne(Integer activityId) {
        throw new NotImplementedException();
    }
}
