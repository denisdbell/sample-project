package com.advantum.activity.service;

import com.advantum.App;
import com.advantum.activity.model.*;
import com.advantum.activity.repository.ActivityTypeRepository;
import com.advantum.activity.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional()
@SpringApplicationConfiguration(App.class)
public class ActivityServiceIntegrationTest {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private ActivityTypeRepository activityTypeRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    @Sql("../repository/dummy-data.sql")
    public void testCreateActivity() {
        ActivityType activityType = activityTypeRepository.getOne(1);
        User user = userRepository.getOne(1);
        Activity activity = new Activity(1, "Activity Created from Service", new Date(), new Date(), "test", activityType, new ArrayList<ActivityDelay>(), user);

        activityService.add(activity);

        List<Activity> activityList = activityService.list();
        Assert.assertTrue("There is one created activity", activityList.size() == 1);

        Activity activityFound = activityList.get(0);
        Assert.assertEquals("The found activity is the created one", activityFound.getActivityId(), activity.getActivityId());
    }

    @Test
    @Sql("../repository/dummy-data.sql")
    public void testFindActivity() {
        Activity activity = activityService.findOne(1);
        Assert.assertEquals("Found Activity with Id 1", "Activity description 01", activity.getDescription());
    }

    @Test
    @Sql("../repository/dummy-data.sql")
    public void testFindFakeActivity() {
        Activity activity = activityService.findOne(9999);
        Assert.assertNull("There should be no Activity found", activity);
    }
}
