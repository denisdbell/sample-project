package com.advantum.activity.controller.rest;

import com.advantum.activity.model.Activity;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */
public class ActivityControllerTest {

    private ActivityRestController activityRestController;

    @Test
    public void testActivityListGetMethodStatus() {
        ResponseEntity<List<Activity>> response =  activityRestController.list();

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }
}
