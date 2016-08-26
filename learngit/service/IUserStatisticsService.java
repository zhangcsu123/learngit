package com.carelinker.drug.service;

import com.carelinker.drug.model.UserStatistics;

public interface IUserStatisticsService {

    UserStatistics getUserStatisticsInfo(String mainStoreId, String patientId);

}
