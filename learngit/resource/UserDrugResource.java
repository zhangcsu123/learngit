package com.carelinker.drug.resource;/**
 * Created by fengchu on 16/5/12.
 */

import com.carelinker.config.ResourcePath;
import com.carelinker.core.dao.DataListParams;
import com.carelinker.core.dao.Page;
import com.carelinker.drug.model.UserDrug;
import com.carelinker.drug.service.IUserDrugService;
import com.carelinker.drug.vo.UserDrugListVo;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(ResourcePath.USER_DRUG)
public class UserDrugResource {

    @Resource
    private IUserDrugService userDrugService;

    @RequestMapping(path = "tpDrugBuyingHistory", method = RequestMethod.GET)
    public UserDrugListVo doTpUserProfileFunction(@ApiParam(value = "起始时间", defaultValue = "20130101000000")
                                                                   @RequestParam(value = "bDateT", required = false) String bDateT,
                                                  @ApiParam(value = "结束时间", defaultValue = "20170201000000")
                                                                   @RequestParam(value = "eDateT", required = false) String eDateT,
                                                  @ApiParam(value = "排序字段")
                                                                   @RequestParam(value = "orderBy", required = false) String orderBy,
                                                  @ApiParam(value = "起始点", defaultValue = "0")
                                                                   @RequestParam(value = "startPosition", required = false, defaultValue = "0") int startPosition,
                                                  @ApiParam(value = "是否倒序", defaultValue = "true")
                                                                   @RequestParam(value = "isDesc", required = false, defaultValue = "true") boolean isDesc,
                                                  @ApiParam(value = "条数", defaultValue = "10")
                                                                   @RequestParam(value = "size", required = false, defaultValue = "0") int size,
                                                  @ApiParam(value = "第几页", defaultValue = "0")
                                                                   @RequestParam(value = "cPage", required = false, defaultValue = "0") int cPage,
                                                  @ApiParam(value = "用户账号", defaultValue = "15992068055")
                                                                   @RequestParam("userName") String userName,
                                                  @ApiParam(value = "门店", defaultValue = "0763000")
                                                                   @RequestParam("drugStoreId") String drugStoreId){

        DataListParams dataListParams = new DataListParams(bDateT, eDateT, orderBy, startPosition, isDesc, size, cPage);

        Page page = userDrugService.getPage(dataListParams, userName, drugStoreId);

        List<UserDrug> drugBuyingHistoryInfoList = userDrugService.listByUserName(dataListParams,userName,drugStoreId);

        return new UserDrugListVo(drugBuyingHistoryInfoList, page);
    }
}
