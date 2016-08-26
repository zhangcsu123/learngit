package com.carelinker.drug.dao;


import com.carelinker.drug.model.UserStatistics;

public interface IUserStatisticsDao {

    UserStatistics getUserStatisticsInfo(String mainStoreId, String patientId);

}
