package com.carelinker.drug.dao.impl;/**
 * Created by fengchu on 16/5/12.
 */

import com.carelinker.core.dao.carelinker.BaseDao;
import com.carelinker.drug.dao.IUserStatisticsDao;
import com.carelinker.drug.model.UserStatistics;
import org.springframework.stereotype.Repository;

@Repository
public class UserStatisticsDao extends BaseDao implements IUserStatisticsDao {

    @Override
    public UserStatistics getUserStatisticsInfo(String mainStoreId, String patientId) {

        String hql = "SELECT new com.carelinker.drug.model.UserStatistics " +
                "(cmps.lastServiceTime, cmps.lastConsumptionTime, cmps.employeeUserId, cmps.customerUnitPrice, cmps.customerFrequency, cmps.totalMoney, cmps.measureFrequency) " +
                "FROM TCmDrugStoreCrmPatientStat cmps " +
                "WHERE cmps.mainStoreId = :mainStoreId AND cmps.patientId = :patientId ";

        return (UserStatistics) super.getByParams(UserStatistics.class, hql, mainStoreId, patientId);
    }
}
