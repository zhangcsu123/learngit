package com.carelinker.drug.service.impl;

import com.carelinker.core.dao.DataListParams;
import com.carelinker.core.dao.Page;
import com.carelinker.core.service.carelinker.TBaseServiceImpl;
import com.carelinker.drug.dao.IUserDrugDao;
import com.carelinker.drug.model.UserDrug;
import com.carelinker.drug.service.IUserDrugService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhang on 2016/6/15.
 */
@Service
public class UserDrugServiceImpl extends TBaseServiceImpl implements IUserDrugService {


    @Resource
    private IUserDrugDao userDrugDao;

    @Override
    public List<UserDrug> listByUserName(DataListParams dataListParams, String userName, String drugStoreId) {

        return userDrugDao.listByUserName(dataListParams,userName,drugStoreId);

    }

    @Override
    public Page getPage(DataListParams dataListParams, String userName,String drugStoreId){

        if (dataListParams.getCurrentPage() == 0) {
            return null;
        }

        int count = 0;

        count =  userDrugDao.countByPatient(dataListParams,userName,drugStoreId);

        dataListParams.setPage(count);
        return dataListParams.getPage();
    }


}
