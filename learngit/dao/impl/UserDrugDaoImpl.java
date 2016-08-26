package com.carelinker.drug.dao.impl;/**
 * Created by fengchu on 16/5/12.
 */

import com.carelinker.core.dao.DataListParams;
import com.carelinker.core.dao.tpdata.TpDataBaseDao;
import com.carelinker.drug.dao.IUserDrugDao;
import com.carelinker.drug.model.UserDrug;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDrugDaoImpl extends TpDataBaseDao implements IUserDrugDao {

    @Override
    public List<UserDrug> listByUserName(DataListParams dataListParams, String userName, String drugStoreId) {

        String hql = "SELECT new com.carelinker.drug.model.UserDrug " +
                "(td.drugNo, tg.drugName, td.buyNum) " +
                "FROM TTpMember tm, TTpDrug td, TTpGoods tg " +
                "WHERE tm.userName = :userName AND tm.mainStoreId = :drugStoreId AND tm.msCardId = td.msCardId AND tm.mainStoreId = td.mainStoreId AND td.mainStoreId = tg.mainStoreId AND td.drugNo = tg.drugNo ";

        dataListParams.setDateParam("td.id.createDate");
        return super.listData(hql, dataListParams, userName, drugStoreId);

    }

    @Override
    public int countByPatient(DataListParams dataListParams, String userName, String drugStoreId) {

        String hql = "SELECT COUNT(*)" +
                " FROM TTpMember tm, TTpDrug td" +
                " WHERE tm.userName = :userName AND tm.mainStoreId = :drugStoreId AND tm.msCardId = td.msCardId AND tm.mainStoreId = td.mainStoreId";

        dataListParams.setDateParam("td.id.createDate");
        return super.getCount(hql, dataListParams, userName, drugStoreId);

    }
}
