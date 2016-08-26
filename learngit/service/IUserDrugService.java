package com.carelinker.drug.service;

import com.carelinker.core.dao.DataListParams;
import com.carelinker.core.dao.Page;
import com.carelinker.drug.model.UserDrug;

import java.util.List;

public interface IUserDrugService {

    List<UserDrug> listByUserName(DataListParams dataListParams, String userName, String drugStoreId);

    Page getPage(DataListParams dataListParams, String userName,String drugStoreId);
}
