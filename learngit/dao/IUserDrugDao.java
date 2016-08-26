package com.carelinker.drug.dao;


import com.carelinker.core.dao.DataListParams;
import com.carelinker.drug.model.UserDrug;

import java.util.List;


public interface IUserDrugDao {

    List<UserDrug> listByUserName(DataListParams dataListParams, String userName, String drugStoreId);

    int countByPatient(DataListParams dataListParams, String userName,String drugStoreId);
}
