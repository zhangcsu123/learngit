package com.carelinker.drug.vo;

import com.carelinker.core.dao.Page;
import com.carelinker.core.resource.PublicResponseParams;
import com.carelinker.drug.model.UserDrug;

import java.util.List;

/**
 * Created by zhang on 2016/6/16.
 */
public class UserDrugListVo extends PublicResponseParams {

    private List<UserDrug> UserDrugList;
    private Page page;

    public UserDrugListVo(List<UserDrug> drugBuyHistoryInfoList, Page page) {
        UserDrugList = drugBuyHistoryInfoList;
        this.page = page;
    }

    public List<UserDrug> getDrugBuyHistoryInfoList() {
        return UserDrugList;
    }

    public void setDrugBuyHistoryInfoList(List<UserDrug> drugBuyHistoryInfoList) {
        UserDrugList = drugBuyHistoryInfoList;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
