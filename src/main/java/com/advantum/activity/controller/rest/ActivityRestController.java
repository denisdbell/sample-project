package com.advantum.activity.controller.rest;

import com.advantum.activity.model.Activity;
import com.advantum.activity.service.ActivityNotFoundRuntimeException;
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
        Activity activity = activityService.findOne(activityId);
        if (activity != null) {
            return new ResponseEntity<Activity>(activity, HttpStatus.OK);
        }  else {
            return new ResponseEntity<Activity>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Activity> add(Activity activity) {
        Activity createdActivity = activityService.add(activity);
        return new ResponseEntity<Activity>(createdActivity, HttpStatus.OK);
    }

    public ResponseEntity<Activity> update(Integer activityId, Activity activity) {
        try {
            Activity updatedActivity = activityService.update(activityId, activity);
            return new ResponseEntity<Activity>(updatedActivity, HttpStatus.OK);
        } catch (ActivityNotFoundRuntimeException e) {
            return new ResponseEntity<Activity>(HttpStatus.NOT_FOUND);
        }
    }
}
