package com.advantum.activity.service;

import com.advantum.App;
import com.advantum.activity.repository.ActivityRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Sevila <josevilah@gmail.com> on 15/12/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional()
@SpringApplicationConfiguration(App.class)
public class ActivityServiceIntegrationTest {

    @Autowired
    private ActivityRepository activityRepository;

}
