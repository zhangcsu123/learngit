package com.carelinker.drug.vo;

import com.carelinker.core.resource.PublicResponseParams;
import com.carelinker.drug.model.UserStatistics;

/**
 * Created by zhang on 2016/7/5.
 */
public class UserStatisticsVo extends PublicResponseParams {

    private UserStatistics userStatistics;

    public UserStatisticsVo(UserStatistics userStatistics) {
        this.userStatistics = userStatistics;
    }

    public UserStatistics getUserStatistics() {
        return userStatistics;
    }

    public void setUserStatistics(UserStatistics userStatistics) {
        this.userStatistics = userStatistics;
    }
}
