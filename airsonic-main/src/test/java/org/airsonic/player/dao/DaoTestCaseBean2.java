package org.airsonic.player.dao;

import org.airsonic.player.util.HomeRule;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DaoTestCaseBean2 {
    @ClassRule
    public static final HomeRule airsonicRule = new HomeRule();

    @Autowired
    JdbcTemplate jdbcTemplate;

    JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
