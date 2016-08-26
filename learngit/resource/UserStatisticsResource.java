package com.carelinker.drug.resource;/**
 * Created by fengchu on 16/5/12.
 */

import com.carelinker.config.ResourcePath;
import com.carelinker.drug.service.IUserStatisticsService;
import com.carelinker.drug.vo.UserStatisticsVo;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping(ResourcePath.USER_DRUG)
public class UserStatisticsResource {

    @Resource
    private IUserStatisticsService userStatisticsService;

    @RequestMapping(path = "tpDrugStatistics", method = RequestMethod.GET)
    public UserStatisticsVo doTpDrugStatisticsFunction(@ApiParam(value = "门店ID", defaultValue = "0519000")
                                                                   @RequestParam("mainStoreId") String mainStoreId,
                                                    @ApiParam(value = "患者Id", defaultValue = "5dc614c946c847039a054b3c5d8686af")
                                                                   @RequestParam("patientId") String patientId){

        return new UserStatisticsVo(userStatisticsService.getUserStatisticsInfo(mainStoreId,patientId));
    }
}
