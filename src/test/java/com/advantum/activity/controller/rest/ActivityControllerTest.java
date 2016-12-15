package com.advantum.activity.controller.rest;

import com.advantum.activity.model.Activity;
import com.advantum.activity.service.ActivityService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
public class ActivityControllerTest {

    @Mock
    private ActivityService activityService;

    @InjectMocks
    private ActivityRestController activityRestController;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testActivityListGetMethodStatus() {

        Mockito.when(activityService.list()).thenReturn(new ArrayList<Activity>());

        ResponseEntity<List<Activity>> response =  activityRestController.list();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @Test
    public void testActivityGetMethodStatus() {
        Activity activity = new Activity();
        activity.setActivityId(1);
        Mockito.when(activityService.findOne(1)).thenReturn(activity);

        ResponseEntity<Activity> response = activityRestController.findOne(activity.getActivityId());

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }
}
