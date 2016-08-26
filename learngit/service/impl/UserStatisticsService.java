package com.carelinker.drug.service.impl;

import com.carelinker.drug.dao.IUserStatisticsDao;
import com.carelinker.drug.model.UserStatistics;
import com.carelinker.drug.service.IUserStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhang on 2016/6/15.
 */
@Service
public class UserStatisticsService implements IUserStatisticsService {

    @Resource
    IUserStatisticsDao userStatisticsDao;

    @Override
    public UserStatistics getUserStatisticsInfo(String mainStoreId, String patientId) {

        return userStatisticsDao.getUserStatisticsInfo(mainStoreId,patientId);
    }
}
